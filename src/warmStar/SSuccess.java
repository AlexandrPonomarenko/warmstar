package warmStar;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "SSuccess", urlPatterns = "youroffice/success")
public class SSuccess extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        ServletContext servletContext = request.getServletContext();
        ControllerBasket controllerBasket = (ControllerBasket)servletContext.getAttribute("controllerBasket");
        User user = (User)session.getAttribute("user");
        Product p = (Product)session.getAttribute("productBasket");
        controllerBasket.deleteAllIDUser(user.getId());
        p.deleteAllProduct();
        if(session.getAttribute("order") != null && session.getAttribute("orderTwo") != null)  {
            session.removeAttribute("order");
            session.removeAttribute("orderTwo");
        }
        request.getRequestDispatcher(request.getContextPath() + "/youroffice/success.jsp").forward(request,response);
    }
}
