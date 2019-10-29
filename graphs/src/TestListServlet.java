import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/test1")
public class TestListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> test2List = new ArrayList<>();
        test2List.add("test tu");
        test2List.add("is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's");
        test2List.add("publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        test2List.add("but also the leap into electronic typesetting, remaining essentially unchanged");
        test2List.add("What is Lorem Ipsum?");

        String testList = "It is my attribute";
        int num = 5;

        req.setAttribute("nameAttribute", testList);
        req.setAttribute("number", num);
        req.setAttribute("myList", test2List);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("test1.jsp");
        requestDispatcher.forward(req, resp);
    }
}
