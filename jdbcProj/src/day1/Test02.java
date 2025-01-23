package day1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import vo.day1.Customer;

public class Test02 {

    public static void main(String[] args) {
        Connection connection = OracleConnectionUtil.getConnection();

        String customId="hongGS";
        String sql="SELECT * FROM TBL_CUSTOMER WHERE CUSTOM_ID=:?";

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {


            pstmt.setString(1,customId);
            ResultSet rs=pstmt.executeQuery();

            Customer customer  = null;
            if(rs.next()) {
                customer = new Customer(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getInt(4),
                    rs.getDate(5)
                );
            }
            
        }catch(SQLException e) {
            System.out.println("SELECT 실행 예외 :" +e.getMessage());
        }
        OracleConnectionUtil.close(connection);
    }

}
