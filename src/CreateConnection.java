import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {
     final static String user = "postgres";
     final static String password = "postgres";

     final static String url = "jdbc:postgresql://localhost:5432/postgres";

     public static Connection createConnection()  {
         Connection connection = null;
         try {
             Class.forName("org.postgresql.Driver");
             connection = DriverManager.getConnection(url, user, password);
             System.out.println("connection create succefully");
         }catch (ClassNotFoundException  | SQLException e ) {
             throw new RuntimeException();
         }
         return connection;
     }
}
