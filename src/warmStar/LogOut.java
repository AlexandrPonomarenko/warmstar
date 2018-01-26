package warmStar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LogOut", urlPatterns = "/logout")
public class LogOut extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if(session != null && session.getAttribute("user") !=null){
            System.out.println( "before " + session.getId());
            session.removeAttribute("user");
            session.invalidate();
            System.out.println( " After " + session.getId() + " 44444 " + session.getAttribute("user"));
            if(session.getAttribute("user") != null){
                System.out.println("HELLLLLLLLLOOOOOOOOOOOOOOOOOO");
            }else if(session.getAttribute("user") == null){
                System.out.println("NULLLLLLLLLLLLLLLLLLLLLL");
            }
            response.sendRedirect(request.getContextPath() + "/warmStar");
        }
    }
}
