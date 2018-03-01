package warmStar;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Order", urlPatterns = "/youroffice/order")
public class Order extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("buy").equals("allBuy")){
//            ServletContext servletContext = request.getServletContext();
            Email email;
//            ControllerBasket controllerBasket = (ControllerBasket)servletContext.getAttribute("controllerBasket");
            HttpSession session = request.getSession(false);
            User user = (User)session.getAttribute("user");
            Product p = (Product)session.getAttribute("productBasket");
//            controllerBasket.deleteAllIDUser(user.getId());
            email = new Email(user.getFirstName(), user.getEmail(), session.getAttribute("city").toString(), session.getAttribute("address").toString(),
                    p.getAllCost(),"all");
            email.sendEmail();
//            p.deleteAllProduct();
            System.out.println("TYT BILL I");
            if(session.getAttribute("order") != null){
                session.setAttribute("orderTwo", "orderTwo");
            }
            response.sendRedirect(request.getContextPath() + "/youroffice/success");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("torotortowerotoweorweoroweorwoerowoer");
//        HttpSession session = request.getSession(false);
//        User user = (User)session.getAttribute("user");
//        Product p = (Product)session.getAttribute("productBasket");
//        request.setAttribute("city", session.getAttribute("city"));
//        request.setAttribute("name", user.getFirstName());
//        request.setAttribute("address", session.getAttribute("address"));
        request.getRequestDispatcher(request.getContextPath() + "/youroffice/order.jsp").forward(request, response);
    }
}
