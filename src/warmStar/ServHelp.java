package warmStar;

import com.sun.org.apache.xpath.internal.operations.String;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ServHelp",urlPatterns = "/help")
public class ServHelp extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ErrorHelp errorHelp = new ErrorHelp();
        errorHelp.checkFild(request.getParameter("name"), "name");
        errorHelp.checkFild(request.getParameter("email"), "email");
        errorHelp.checkTextFild(request.getParameter("texthelp"), "texthelp");
        if(errorHelp.getValidate()){
            Email email = new Email(request.getParameter("name"), request.getParameter("email"), request.getParameter("texthelp"), "help");
            email.sendEmail();
            request.setAttribute("ok", "your message has been sent.");
            request.getRequestDispatcher(request.getContextPath() + "/help.jsp").forward(request,response);
            System.out.println("ESSSSSSSSSSSSSSSSSSSS");
        }else{
            request.setAttribute("errorHelp", errorHelp.getMapError());
            request.getRequestDispatcher(request.getContextPath() + "/help.jsp").forward(request,response);
        }
//        if(request.getParameter("name") != null && !request.getParameter("name").isEmpty()) {
//            Email email = new Email(request.getParameter("name"), request.getParameter("email"), request.getParameter("texthelp"), "help");
//            email.sendEmail();
//            System.out.println("ESSSSSSSSSSSSSSSSSSSS");
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session.getAttribute("name") != null){
//            User user = (User)session.getAttribute("user");
//            request.setAttribute("user",session.getAttribute("user"));
            request.setAttribute("user",session.getAttribute("user"));
        }
        request.getRequestDispatcher(request.getContextPath() + "/help.jsp").forward(request,response);
    }
}
