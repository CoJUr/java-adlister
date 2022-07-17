import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/albums")
public class AlbumsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Albums albumsDao = (Albums) DaoFactory.getAuthorsDao();
        List<Album> albums = albumsDao.all();
        req.setAttribute("albums", albums);
        req.getRequestDispatcher("/WEB-INF/albums.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String album_name = req.getParameter("album_name");
//        Albums albumsDao = DaoFactory.ww
    }
}
