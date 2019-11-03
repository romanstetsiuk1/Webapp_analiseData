import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet("/totalClosedTransactions")
public class GetDataTotalClTr extends HttpServlet {

    private long id;
    private String date;
    private String commission;
    private String swap;
    private String profit;
    private String closedTrade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public String getSwap() {
        return swap;
    }

    public void setSwap(String swap) {
        this.swap = swap;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public String getClosedTrade() {
        return closedTrade;
    }

    public void setClosedTrade(String closedTrade) {
        this.closedTrade = closedTrade;
    }

    @Override
    public String toString() {
        return "GetDataTotalClTr{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", commission='" + commission + '\'' +
                ", swap='" + swap + '\'' +
                ", profit='" + profit + '\'' +
                ", closedTrade='" + closedTrade + '\'' +
                '}';
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int test = 10;
        req.setAttribute("test", test);


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
                queryResult += resultSet.getString("raportDate");

            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        req.setAttribute("db", queryResult);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("totalClosedTransactions.jsp");
        requestDispatcher.forward(req, resp);

    }
}
