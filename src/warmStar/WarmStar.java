package warmStar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "WarmStar", urlPatterns = "/warmStar")
public class WarmStar extends HttpServlet {
    HttpSession httpSession;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        httpSession = request.getSession();
//        if(httpSession != null){
//            request.getRequestDispatcher("Welcome.html").forward(request,response);
//        }else{
//            request.getRequestDispatcher("index.jsp").forward(request,response);
//        }
        request.getRequestDispatcher("index.jsp").forward(request,response);

    }
}
