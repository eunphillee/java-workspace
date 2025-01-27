import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TblBuyDao {

  private static final String URL = "jdbc:oracle:thin:@//localhost:1521/xe "; 
  private static final String USERNAME = "c##idv";
  private static final String PASSWORD = "1234";

  private Connection getConnection()  throws SQLException{
    return DriverManager.getConnection(URL, USERNAME, PASSWORD);
  }

  public int insertMany(list<BuyVo> cart) {

    
  }




}