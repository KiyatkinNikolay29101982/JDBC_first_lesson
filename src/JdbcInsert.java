import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {
    public static void main(String[] args){
        try(Connection connection = CreateConnection.createConnection();
            Statement statement = connection.createStatement()
        ){

            String insertSQL1 = "INSERT INTO persons (persone_name, person_age, person_address, salary) VALUES('Ivanov', 18, 'Moscow', 100000); ";
            statement.executeUpdate(insertSQL1);

            String insertSQL2 = "INSERT INTO persons (persone_name, person_age, person_address, salary) VALUES('Petrov', 38, 'Samara', 100000); ";
            statement.executeUpdate(insertSQL2);

            String insertSQL3 = "INSERT INTO persons (persone_name, person_age, person_address, salary) VALUES('Sidorov', 48, 'SentPiterburg', 100000); ";
            statement.executeUpdate(insertSQL3);


            System.out.println("insert table succefully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
