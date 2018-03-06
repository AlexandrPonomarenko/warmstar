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
            Email email;
            HttpSession session = request.getSession(false);
            User user = (User)session.getAttribute("user");
            Product p = (Product)session.getAttribute("productBasket");
            email = new Email(user.getFirstName(), user.getEmail(), session.getAttribute("city").toString(), session.getAttribute("address").toString(),
                    p.getAllCost(),"all");
            email.sendEmail();
            if(session.getAttribute("order") != null){
                session.setAttribute("orderTwo", "orderTwo");
            }
            response.sendRedirect(request.getContextPath() + "/youroffice/success");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher(request.getContextPath() + "/youroffice/order.jsp").forward(request, response);
    }
}
