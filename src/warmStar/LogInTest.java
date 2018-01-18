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

@WebServlet(name = "LogInTest" , urlPatterns = "/logIn")
public class LogInTest extends HttpServlet {
    public void init(){
//        c = new ControllerMySQL();
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
        if(errorLogIn.getValidate()){
            System.out.println("Зашел в валидайтион");
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
                System.out.println("проверил логин");
                request.getRequestDispatcher("test.html").forward(request,response);
            }else{
                c.insert(user);
                response.sendRedirect(request.getContextPath()+ "/logOn");
            }
        }else{
            System.out.println("asdasdasdasddsdsdsdsdsdsdsdsdsdsdsdsddsdsdsdsdssdsdssd");
            request.setAttribute("error", errorLogIn);
            request.getRequestDispatcher("/logOn").forward(request,response);
//            response.sendRedirect(request.getContextPath()+ "/logOn");
        }
//        user.setNickName(login);
//        user.setFirstName(fName);
//        user.setLastName(lName);
//        user.setEmail(email);
//        user.setPhoneNamber(pNumber);
//        user.setAge(Integer.parseInt(age));
//        long mills = System.currentTimeMillis();
//        user.setData(new Date(mills));
//        user.setPassword(password);
//        user.setPasswordTwo(password2);
//        if(c.getByLogin(login)){
//            request.getRequestDispatcher("test.html").forward(request,response);
//        }else{
//            c.insert(user);
////            servletContext.setAttribute("user", user);
//            response.sendRedirect(request.getContextPath()+ "/logOn");
////            request.getRequestDispatcher("LogOn").forward(request,response);
//        }
//        System.out.println(login + fName + lName + pNumber + age + new Date(mills) + password + password2);
        System.out.println(user.toString());

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Pered");
//        response.sendRedirect("LogIn");
        request.getRequestDispatcher("LogIn.jsp").forward(request,response);
        System.out.println("WORK");
    }
}
