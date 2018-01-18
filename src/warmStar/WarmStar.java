package warmStar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "WarmStar", urlPatterns = "/warmStar",loadOnStartup = 0)
public class WarmStar extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession = request.getSession();
        if(httpSession == null){
            System.out.println("dsdsdsdsdsdsdsdsdsdsdsssdsdsdsdsdsds");
        }

        System.out.println("111 " + request.getContextPath() + " dddddd " + request.getRequestURI() + "rrr " + request.getServletPath());
        System.out.println("TYTYTYYTY");
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
