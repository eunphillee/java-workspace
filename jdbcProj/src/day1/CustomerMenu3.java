package day1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerMenu3 {

    public static void main(String[] args) {

        System.out.println("============== 고객등록(회원 가입)메뉴 입니다. =============");
        System.out.println("아이디 입력 >>>");
        String customid = System.console().readLine();

        System.out.println("이름 입력 >>>");
        String name = System.console().readLine();

        System.out.println("이메일 입력 >>>");
        String email = System.console().readLine();

        System.out.println("나이 입력 >>> ");
        int age = Integer.parseInt(System.console().readLine());
        
                String sql="INSERT INTO TBL_CUSTOMER(custom_id, name, email, age, reg_date ) "+
                "VALUES (?,?,?,?,sysdate)";

        Connection connection = OracleConnectionUtil.getConnection();

          try (PreparedStatement pstmt = connection.prepareStatement(sql)){

            pstmt.setString(1,customid);
            pstmt.setString(2,name);
            pstmt.setString(3,email);
            pstmt.setInt(4,age);

            int result = pstmt.executeUpdate();
            if(result ==1)
                System.out.println("회원가입 완료");
            else
                System.out.println("회원가입 안됨. ");
            
        } catch (Exception e) {
            System.out.println("SQL 실행 예외 :" + e.getMessage());
        }
        OracleConnectionUtil.close(connection);
        
    }

 



}
