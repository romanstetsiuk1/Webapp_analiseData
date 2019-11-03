import java.sql.*;

public class Main {

    public static void main(String[] args) {
        //        connect with DB MySQL
        String userName = "root";
        String password = "pass";
        String connectionUrl = "jdbc:mysql://localhost/trading?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        String queryResult = "test";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
            Statement statement = connection.createStatement();
            String query = "SELECT raportDate FROM totalClosedTransactions";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                System.out.println(resultSet.getString("raportDate"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
