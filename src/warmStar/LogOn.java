package warmStar;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "LogOn",urlPatterns = "/logOn")
public class LogOn extends HttpServlet {
    public void init(){
//        c = new ControllerMySQL();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        ControllerMySQL c = (ControllerMySQL) servletContext.getAttribute("controllerUser");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        System.out.println(login + password);
        if(c.validationUser(login,password)){
            HttpSession session = request.getSession(true);
            session.setAttribute("login", login);
            session.setAttribute("password", password);
            response.sendRedirect(request.getContextPath()+"/yourOffice");
            System.out.println("if");
        }else{
            request.getRequestDispatcher("test.html").forward(request,response);
            System.out.println("ELSE");
        }
        System.out.println(login + password );
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Pered-LogOn");
        request.getRequestDispatcher("LogOn.jsp").forward(request,response);
        System.out.println("WORK-LogOn");
    }
}
