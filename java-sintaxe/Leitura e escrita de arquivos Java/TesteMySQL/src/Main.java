import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/teste";
        String username = "root";
        String password = "d3LWRNlAIffe5yc";
        //Connection conn = DriverManager.getConnection(url,username,password);

        //String sql = "select * from usuario";
        MinhaInterface main = new MinhaInterface();


    }

}