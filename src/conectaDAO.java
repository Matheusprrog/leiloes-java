
    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectaDAO {
    public Connection connectDB() {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://127.0.0.1:3306/uc11";
            String user = "root";
            String password = "Matheus110207@"; 

            conn = DriverManager.getConnection(url, user, password);

        } catch (SQLException erro) {
            System.out.println("Erro ConectaDAO: " + erro.getMessage());
        }

        return conn;
    }
}

