import Entity.Person;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcIOE {
    public static void main(String [] args){
        List<Person> people = new ArrayList<>();
        try(Connection connection = CreateConnection.createConnection();
            Statement statement = connection.createStatement()
        ){
            ResultSet resultSet = statement.executeQuery("SELECT * FROM persons");
            while(resultSet.next()){
                Long id = resultSet.getLong(1);
                String name = resultSet.getString(2);
                Integer age = resultSet.getInt(3);
                String adress = resultSet.getString(4);
                Integer salary = resultSet.getInt(5);
                people.add(new Person(name,age,adress,salary));
            }

            System.out.println("extract succefully. Created list, it length = " + people.size());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        for(Person p : people){
            System.out.println(p.toString());
        }
    }
}
