import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/about")
public class AboutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        super.doGet(req, resp);

        String name = request.getParameter("name");

        if (name == null) {
            name = "User";
        }

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<h1>About Us</h1>");
        out.println("<h2>More html</h2>");
        out.println("<h2>Another line</h2>");

        String html = "<h1>About Us</h1>";

        html+= "<a href='/contact-us'>Contact Us</a>'";
        html += "<h2> Name is: " + name + "</h2>";

        //add a form to add email address to mailing list
        html += "<h3>Email list signup</h3>";
        html += "<form action='/about' method='POST'> " +
                "<label>Email</label>" +
                "<input name='email' type='email' placeholder='Enter email'>" +
                "<button>Submit</button>" +
                "</form>";

//        making JS code

//        html+= "<script>alert('" + request.getParameter("Saved") + "') </script>";

        if (request.getParameter("saved") != null) {
            html+= "<script>alert('Email saved!')</script>";
        }

        out.println(html);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
    String email = req.getParameter("email");
        System.out.println(email);
        //magically saving the email to db here. redirect them now
        resp.sendRedirect("/about?saved");


    }
}
