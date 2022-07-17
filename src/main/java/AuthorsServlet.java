import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AuthorsServlet", value = "/authors")
public class AuthorsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Authors authorsDao = DaoFactory.getAuthorsDao();
        List<Author> authors = authorsDao.all();
        request.setAttribute("authors", authors);
        request.getRequestDispatcher("/WEB-INF/authors.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String last_name = request.getParameter("last_name");
        Authors authorsDao = DaoFactory.getAuthorsDao();

        authorsDao.insert(new Author(0, last_name));
        response.sendRedirect("/authors");
    }
}
