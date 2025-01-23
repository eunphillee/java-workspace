package day1;

import java.sql.Connection;
import java.sql.Statement;

public class Test01 {

    public static void main(String[] args) {
        
        Connection connection = OracleConnectionUtil.getConnection();
        System.out.println("연결확인 : " +connection);

        String sql = "INSERT INTO TBL_CUSTOMER(custom_id, name, email, age, reg_date ) "  +
                        "VALUES ('hongGS1', '홍길순', 'gilsoon2@korea.com', 29, sysdate)";
        
        try (Statement stmt = connection.createStatement()){
            System.out.println("Statement 구현 클래스는 ? " + stmt.getClass().getName());

            stmt.executeQuery(sql);
            
        } catch (Exception e) {
            // TODO: handle exception
        }



    }


}
