import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/count")
public class PageCounterServlet extends HttpServlet {

    int pageCount = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        PrintWriter out = resp.getWriter();

        String secretWord = req.getParameter("password");



        if (req.getParameter("password") == null) {
//            resp.sendRedirect("/count");
            pageCount = 0;
        }

        pageCount+= 1;
        out.println("<h1> Page visits so far: " + pageCount + "</h1>");
    }
}
