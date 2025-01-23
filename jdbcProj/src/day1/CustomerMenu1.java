package day1;

import java.sql.Connection;
import java.sql.PreparedStatement;

// 예시: 고객 정보(이메일)를 수정하는 메뉴를 구현하기 
public class CustomerMenu1 {

    public static void main(String[] args) {
        
        System.out.println("============== 고객 정보(이메일)를 수정하는 메뉴 입니다. =============");
        System.out.println("아이디 입력 >>>");
        String customid = System.console().readLine();
        System.out.println(" 수정할 이메일 주소입력 >>>");
        String email = System.console().readLine();
         // 1) update sq, 매개변수 설정.  
        String sql = "UPDATE tbl_customer SET email = ? WHERE costom_id = ?" ;  

        //db 연결하여 update 실행하기  
        Connection connection = OracleConnectionUtil.getConnection();

        try (PreparedStatement pstmt = connection.prepareStatement(sql)){
         // 2) 실행. 매개변수값 전달. 매개변수 인덱스는 sql문의 ? 의 순서 
            pstmt.setString(1, email);
            pstmt.setString(2, customid);
          
            // 2) 실행 매겨변수값 전달 
            int result = pstmt.executeUpdate();
            System.out.println("resul : " +result);
            if (result ==1) {
                System.out.println("고객님 정보를 업데이트 완료 했습니다. ");
            }else{
                System.out.println("고객님 아이디 정보가 없습니다. ");
            }
        } catch (Exception e) {
            System.out.println("Update 예외 :" + e.getMessage());

        }
        OracleConnectionUtil.close(connection);     

    }

}
