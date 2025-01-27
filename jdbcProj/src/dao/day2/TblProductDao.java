package dao.day2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import vo.day1.Product;

public class TblProductDao {

    // Singleton Pattern
    private static TblProductDao dao = new TblProductDao();

    private TblProductDao() { }

    public static TblProductDao getInstance() {
        return dao;
    }

    // Database connection constants
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "your_username";
    private static final String PASSWORD = "your_password";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Insert Method
    public int insert(Product product) throws SQLException {
        String sql = "INSERT INTO TBL_ITEM (NAME, PRICE) VALUES (?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, product.getName());
            pstmt.setInt(2, product.getPrice());
            return pstmt.executeUpdate();
        }
    }

    // Update Method
    public int update(int id, String name, int price) throws SQLException {
        String sql = "UPDATE TBL_ITEM SET NAME = ?, PRICE = ? WHERE ID = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, price);
            pstmt.setInt(3, id);
            return pstmt.executeUpdate();
        }
    }

    // Delete Method
    public int delete(int id) throws SQLException {
        String sql = "DELETE FROM TBL_ITEM WHERE ID = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            return pstmt.executeUpdate();
        }
    }

    // Select By Primary Key
    public Product selectByPk(int id) throws SQLException {
        String sql = "SELECT * FROM TBL_ITEM WHERE ID = ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return new Product(rs.getInt("ID"), rs.getString("NAME"), rs.getInt("PRICE"));
                }
            }
        }
        return null;
    }

    // Search By Keyword
    public ResultSet searchByKeyword(String keyword) throws SQLException {
        String sql = "SELECT * FROM TBL_ITEM WHERE NAME LIKE ?";
        try (Connection conn = getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "%" + keyword + "%");
            return pstmt.executeQuery();
        }
    }
}
