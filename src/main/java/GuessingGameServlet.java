import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/guess")
public class GuessingGameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher view = req.getRequestDispatcher("/guess-form.jsp");
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        handling form submission

//        guess must be 1 - 3 and random

        int randomNumber = (int) (Math.random() *3) + 1;

        int guess = Integer.parseInt(req.getParameter("guess"));

//        check if guess = random #, then show correct
        if (guess ==randomNumber) {
            resp.sendRedirect("/correct");

        } else {
            resp.sendRedirect("/incorrect");
        }
    }
}
