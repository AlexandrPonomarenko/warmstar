package warmStar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "SBasket", urlPatterns = "/youroffice/basket")
public class SBasket extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ErrorOrder errorOrder;
        System.out.println("/youroffice/basket " + "dsdsdsdsdsdsdsdsdsd");
        if(request.getParameter("model") != null && request.getParameter("model") != null && request.getParameter("model") != null){
            System.out.println(request.getParameter("model") + " " +request.getParameter("model") + " ---- " +  request.getParameter("model"));
        }else {
            System.out.println("tytytytyt");
            errorOrder = new ErrorOrder();
            errorOrder.checkFild(request.getParameter("city"));
            errorOrder.checkFild(request.getParameter("address"));
            if(errorOrder.getValidate()) {
                HttpSession session = request.getSession(false);
                System.out.println(request.getParameter("city") + "  -- " + request.getParameter("address"));
                session.setAttribute("city", request.getParameter("city"));
                session.setAttribute("address", request.getParameter("address"));
//                if (request.getParameter("city") != null && !request.getParameter("city").isEmpty() &&
//                        request.getParameter("address") != null && !request.getParameter("address").isEmpty()) {
                    session.setAttribute("order", "order");
//                }
                response.sendRedirect(request.getContextPath() + "/youroffice/order");
            }

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        Product p = (Product)session.getAttribute("productBasket");
        System.out.println("111 " + request.getContextPath() + " dddddd " + request.getRequestURI() + " rrr " + request.getServletPath());
        if(p.getLength() > 0){
            System.out.println(p.getLength() + "SBasket");
            p.products();
            request.setAttribute("out", p.getProducts());
            request.setAttribute("cost", p.getAllCost());
            request.getRequestDispatcher(request.getContextPath() + "/youroffice/basket.jsp").forward(request, response);
        }else if(p.getLength() <= 0){
            request.setAttribute("ziro", "Корзина пуста");
            request.getRequestDispatcher(request.getContextPath() + "/youroffice/basket.jsp").forward(request, response);
        }
    }

    private void proccess(HttpServletRequest request, HttpSession session){
//        HttpSession s  = session;
//        Product p = (Product)s.getAttribute("productBasket");
//        if(p.getLength() <= 0){
//            request.setAttribute("ziro", "Корзина пуста");
//        }else if(p.getLength() > 0){
//            request.setAttribute("out", p.getProducts());
//        }
    }
}
