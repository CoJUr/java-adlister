import model.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/ads")
public class AdIndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Ad> ads = new ArrayList<>(Arrays.asList(
                new Ad(1, "Hammer for sale", "Hits nails good"),
                new Ad(2, "Drill for sale", "Drills pretty good"),
                new Ad(3, "Saw for sale", "Saws wood gooder than good"),
                new Ad(4, "Jack for sale", "Good for jackin'")





        ));



        req.setAttribute("ads", ads);

        String SomeVal = "Code up!";
//        ^put this into the .jsp via 2nd arg(value) of setAttribute

        req.setAttribute("kodeUp", SomeVal);
//        ^passes data to the jsp file. attribute name + value for the args

        req.setAttribute("kodeUp", "trash panda");

        req.getRequestDispatcher("/ads.jsp").forward(req, resp);
    }
}
