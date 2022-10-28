
// cSpell: disable
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectSQL {
    // Para uso com Postgres, faça somente a alteração dos campos url, user e password.
    // Postgres: url = jdbc:postgresql://localhost:3306/clients
    // MySQL: url = jdbc:mysql://localhost:3306/clients
    // Mariadb: url = jdbc:mysql://localhost:3306/clients
    
    static String driverMySQL = "org.gjt.mysql.Driver";
    static String url = "jdbc:mysql://localhost:3306/clients";
    static String user = "admin";
    static String password = "admin";

    public static void main(String[] args) {
        try {
            
            System.out.println("Iniciando o JDBC");
            Class.forName(driverMySQL);
            Connection connection = DriverManager.getConnection(url, user, password); 
            ResultSet consult_tables = connection.createStatement().executeQuery("SELECT * FROM Clients");

            while (consult_tables.next()) {
                System.out.println("Nome: " + consult_tables.getString("nome"));
            }
            connection.close();
        } catch (ClassNotFoundException e) {

            System.out.println("Driver não localizado, verifique novamente");
        } catch (SQLException e) {

            System.out.println("Erro ao acessar banco " + e.getMessage());
    }
}}