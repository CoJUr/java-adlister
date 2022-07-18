import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/User")
public class UsersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Users usersDao = new UsersDao();
//        now have connection automatically. create list of users using usersDao method
        List<User> users = usersDao.all();

//        pass the list to the view for displaying the results
        req.setAttribute("users", users);
        req.getRequestDispatcher("/WEB-INF/users.jsp").forward(req, resp);
//        req.getRequestDispatcher("/WEB-INF/forward.jsp").forward(req, resp);

    }
}
