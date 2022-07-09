import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/fav-city")
public class FavCity extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
    String city = req.getParameter("city");
    city.replace(' ', '-');
    city.toLowerCase();

        System.out.println(city);
        resp.sendRedirect("https://www.shutterstock.com/search/" + city);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        String html = "<h1>Get pics of your favorite City</h1>";

        html += "<h3>Please submit your favorite city</h3>";
        html += "<form action='/fav-city' method='POST'>" +
                "<label>City</label>" +
                "<input name='city' type ='text' placeholder='city name'>" +
                "<button>Submit</button></form>";

        out.println(html);




    }

}
