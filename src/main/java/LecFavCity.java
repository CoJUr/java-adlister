import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/favCity")
public class LecFavCity extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


//        sends the form

        req.getRequestDispatcher("/city-form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);

//        debug test
        System.out.println("**runs?***");

//        prints out the entered city from the form
        String favoriteCity = req.getParameter("favorite-city");
        System.out.println(favoriteCity);
//        instead might save to database here, or redirect them to city website, etc
    }
}
