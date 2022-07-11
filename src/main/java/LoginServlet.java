import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        check the submitted params from the form. if username = admin + pass = password,
//        redirect to /profile (with response obj). else, redirect back to /login
//        resp.SendRedirect
    String userParam =  req.getParameter("username");
    String passParam = req.getParameter("password");

    if (userParam.equals("admin") && passParam.equals("password")) {
        resp.sendRedirect("/profile");
    }

    }
}
