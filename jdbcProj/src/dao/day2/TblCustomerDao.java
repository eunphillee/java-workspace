package dao.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import vo.day1.Customer;
import vo.day1.Product;

public class TblCustomerDao {

    // 싱글톤 패턴 정의
    private static TblCustomerDao dao = new TblCustomerDao();

    private TblCustomerDao() { }

    public static TblCustomerDao getInstance() {
        return dao;
    }

    // DB 연결 정보를 상수로 정의합니다.
    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/xe";
    private static final String USERNAME = "c##idev";
    private static final String PASSWORD = "1234";

    // DB 연결 객체 만드는 메서드 (DAO 내부에서만 사용)
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    // Insert 메서드 (고객 데이터 삽입)
    public int insert(Customer vo) {
        int result = 0;
        String sql = "INSERT INTO tbl_customer(custom_id, name, email, age, reg_date) " +
                     "VALUES (?, ?, ?, ?, sysdate)";
        try (Connection connection = getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, vo.getCustomId());
            pstmt.setString(2, vo.getName());
            pstmt.setString(3, vo.getEmail());
            pstmt.setInt(4, vo.getAge());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("예외 : " + e.getMessage());
        }
        return result;
    }

    // Update 메서드 (고객 데이터 수정)
    public int update(Customer vo) {
        int result = 0;
        String sql = "UPDATE tbl_customer SET email = ?, postcode = ? WHERE custom_id = ?";
        try (Connection connection = getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, vo.getEmail());
            pstmt.setString(2, vo.getPostcode());
            pstmt.setString(3, vo.getCustomId());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("예외 : " + e.getMessage());
        }
        return result;
    }

    // Delete 메서드 (고객 데이터 삭제)
    public int delete(String customId) {
        int result = 0;
        String sql = "DELETE FROM tbl_customer WHERE custom_id = ?";
        try (Connection connection = getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, customId);
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("예외 : " + e.getMessage());
        }
        return result;
    }

    // SelectByPk 메서드 (고객 데이터 조회)
    public Customer selectByPk(String customId) {
        String sql = "SELECT * FROM tbl_customer WHERE custom_id = ?";
        Customer customer = null;
        try (Connection connection = getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, customId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                customer = new Customer(
                    rs.getString("custom_id"),
                    rs.getString("name"),
                    rs.getString("email"),
                    rs.getInt("age"),
                    rs.getDate("reg_date"),
                    rs.getString("postcode")
                );
            }
        } catch (Exception e) {
            System.out.println("예외 : " + e.getMessage());
        }
        return customer;
    }

    // Main 메서드: TblProductDao 테스트 실행
    public static void main(String[] args) {
        TblProductDao productDao = TblProductDao.getInstance(); // 싱글톤 인스턴스 가져오기

        try {
            // 1. Insert 테스트
            System.out.println("=== Insert 테스트 ===");
            Product newProduct = new Product(1, "새우깡", 2500);
            productDao.insert(newProduct);
            System.out.println("상품 삽입 완료!");

            // 2. Update 테스트
            System.out.println("=== Update 테스트 ===");
            productDao.update(1, "새우깡(업데이트)", 3000);
            System.out.println("상품 업데이트 완료!");

            // 3. SelectByPk 테스트
            System.out.println("=== SelectByPk 테스트 ===");
            Product product = productDao.selectByPk(1);
            if (product != null) {
                System.out.println("조회된 상품: " + product.getName() + ", 가격: " + product.getPrice());
            }

            // 4. SearchByKeyword 테스트
            System.out.println("=== SearchByKeyword 테스트 ===");
            List<Product> products = productDao.searchByKeyword("새우");
            for (Product p : products) {
                System.out.println("검색된 상품: " + p.getName() + ", 가격: " + p.getPrice());
            }

            // 5. Delete 테스트
            System.out.println("=== Delete 테스트 ===");
            productDao.delete(1);
            System.out.println("상품 삭제 완료!");

        } catch (SQLException e) {
            System.err.println("DB 작업 중 오류 발생: " + e.getMessage());
        }
    }
}