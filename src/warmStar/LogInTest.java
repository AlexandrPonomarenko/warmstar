package warmStar;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Map;

@WebServlet(name = "LogInTest" , urlPatterns = "/logIn")
public class LogInTest extends HttpServlet {
    public void init(){
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        ErrorLogIn errorLogIn = new ErrorLogIn();
        ServletContext servletContext = getServletContext();
        ControllerMySQL c = (ControllerMySQL) servletContext.getAttribute("controllerUser");
        String login = request.getParameter("login");
        String email = request.getParameter("email");
        String fName = request.getParameter("FName");
        String lName = request.getParameter("LName");
        String pNumber = request.getParameter("PNumber");
        String age = request.getParameter("age");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
        errorLogIn.checkNickName(login);
        errorLogIn.checkFirstName(fName);
        errorLogIn.checkLastName(lName);
        errorLogIn.checkEmail(email);
        errorLogIn.checkAge(age);
        errorLogIn.checkPhoneNumber(pNumber);
        errorLogIn.checkPasswordOne(password);
        errorLogIn.checkPasswordTwo(password2);
        errorLogIn.printValues(errorLogIn.getMapError());
        if(errorLogIn.getValidate()){
            user.setNickName(login);
            user.setFirstName(fName);
            user.setLastName(lName);
            user.setEmail(email);
            user.setPhoneNamber(pNumber);
            user.setAge(Integer.parseInt(age));
            long mills = System.currentTimeMillis();
            user.setData(new Date(mills));
            user.setPassword(password);
            user.setPasswordTwo(password2);
            if(c.getByLogin(login)){
                // перенаправить на ту же страницу с уведомлением что пользователь с таким логином уже существует!
                request.setAttribute("failLogin", new String("User with such login already exists"));
                request.getRequestDispatcher(request.getContextPath() + "/LogIn.jsp").forward(request,response);
            }else{
                c.insert(user);
                response.sendRedirect(request.getContextPath()+ "/logOn");
            }
        }else{
            request.setAttribute("error", errorLogIn.getMapError());
            request.getRequestDispatcher("/LogIn.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("LogIn.jsp").forward(request,response);
    }
}
