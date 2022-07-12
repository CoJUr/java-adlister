import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pizza-order-form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String crustType = req.getParameter("pizza-crust");
        String saucePreference = req.getParameter("pizza-sauce");
        String sizePreference = req.getParameter("pizza-size");
        String veggiesPreference = req.getParameter("toppingveggies");
        String address = req.getParameter("address");

            List<String> choices = new ArrayList<>();
                choices.add(crustType);
                choices.add(saucePreference);
                choices.add(sizePreference);

        System.out.println(sizePreference);
        System.out.println(saucePreference);
        System.out.println(crustType);
        System.out.println(veggiesPreference);
        System.out.println(address);

        req.setAttribute("address", address);
        req.getRequestDispatcher("/pizza-order-form.jsp").forward(req, resp);
    }
}
