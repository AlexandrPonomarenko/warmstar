package warmStar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "YourOfficeS" , urlPatterns = "/yourOffice")
public class YourOfficeS extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        User user = (User)session.getAttribute("user");
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(user);
        request.setAttribute("user", arrayList);
        request.getRequestDispatcher("yourOffice.jsp").forward(request,response);
    }
}
