import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/greeting")
public class GreetingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        pull out parameter value
        String parameter = req.getParameter("name");

//        String name = "Justin";
        req.setAttribute("name", parameter);

        req.getRequestDispatcher("/greeting.jsp").forward(req, resp);


    }
}
