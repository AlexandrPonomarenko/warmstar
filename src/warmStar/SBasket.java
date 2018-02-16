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

@WebServlet(name = "SBasket", urlPatterns = "/youroffice/basket")
public class SBasket extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session;
        ErrorOrder errorOrder;
        PrintWriter out;
        ServletContext servletContext;
        ControllerBasket controllerBasket;
//        ControllerBasket controllerBasket = (ControllerBasket)servletContext.getAttribute("controllerBasket");
        System.out.println("/youroffice/basket " + "dsdsdsdsdsdsdsdsdsd");
        if(request.getParameter("model") != null && request.getParameter("smodel") != null && request.getParameter("iduser") != null){
            System.out.println(request.getParameter("model") + " --- " +request.getParameter("smodel") + " ---- " +  request.getParameter("iduser"));
            session = request.getSession(false);
            servletContext = request.getServletContext();
            controllerBasket = (ControllerBasket)servletContext.getAttribute("controllerBasket");
            controllerBasket.deleteByIdUser(Integer.parseInt(request.getParameter("iduser")), request.getParameter("model"), request.getParameter("smodel"));
            Product product = (Product)session.getAttribute("productBasket");
            product.deleteProduct(request.getParameter("model"), request.getParameter("smodel"));
            session.setAttribute("productBasket",product);

//            response.setContentType("text/plant");
//            response.setCharacterEncoding("UTF-8");
//            out = response.getWriter();
//            out.print();
        }else {
            System.out.println("tytytytyt");
            errorOrder = new ErrorOrder();
            errorOrder.checkFild(request.getParameter("city"), "city");
            errorOrder.checkFild(request.getParameter("address"), "address");
            if(errorOrder.getValidate()) {
                session = request.getSession(false);
                System.out.println(request.getParameter("city") + "  -- " + request.getParameter("address"));
                session.setAttribute("city", request.getParameter("city"));
                session.setAttribute("address", request.getParameter("address"));
//                if (request.getParameter("city") != null && !request.getParameter("city").isEmpty() &&
//                        request.getParameter("address") != null && !request.getParameter("address").isEmpty()) {
                    session.setAttribute("order", "order");
//                }
                response.sendRedirect(request.getContextPath() + "/youroffice/order");
            }
                System.out.println("BILL TYT");
                request.setAttribute("errorOrder", errorOrder.getMapError());
                request.getRequestDispatcher(request.getContextPath() + "/youroffice/basket.jsp").forward(request,response);
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
