import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/Cookies")
public class CookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("/cookies.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String favorite = req.getParameter("favorite");
                HttpSession session = req.getSession();

        session.setAttribute("name", name);
        session.setAttribute("favorite", favorite);
//

        resp.sendRedirect("/cookies.jsp");
//        req.setAttribute("name", name);
//        req.setAttribute("favorite", favorite);


        req.getRequestDispatcher("/cookies.jsp").forward(req, resp);
    }


}
