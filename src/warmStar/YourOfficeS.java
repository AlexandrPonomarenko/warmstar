package warmStar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "YourOfficeS" , urlPatterns = "/yourOffice")
public class YourOfficeS extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if(session == null){
            System.out.println("===" + session);
            response.sendRedirect(request.getContextPath()+"/logOn");
        }else{
            System.out.println("++++" + session);
            String login =(String)session.getAttribute("login");
            String password =(String)session.getAttribute("password");
            System.out.println("44444444444444444444444" + login + password);
            if(login == null && password == null){
                response.sendRedirect(request.getContextPath()+"/logOn");
            }else{
                response.sendRedirect("yourOffice.jsp");
            }
        }
        System.out.println("1111111111111111111111111111111111");
    }
}
