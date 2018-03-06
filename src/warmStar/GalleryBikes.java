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
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "GalleryBikes", urlPatterns = "/galery/bikes")
public class GalleryBikes extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ТЫ В ПОСТЕ В ГАЛЕРЕЕ БАЙКОВ");
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        ServletContext servletContext = request.getServletContext();
        ControllerBasket controllerBasket = (ControllerBasket)servletContext.getAttribute("controllerBasket");
        HttpSession session = request.getSession(false);
        if(session.getAttribute("user")== null){
            out.print("To add to the cart, you must be logged in.");
        }else if(session.getAttribute("user")!= null){
            User user = (User)session.getAttribute("user");
            Product p = (Product)session.getAttribute("productBasket");
            Basket basket = new Basket();
            basket.setIdUser(user.getId());
            basket.setIdProduct(Integer.parseInt(request.getParameter("idproduct")));
            basket.setModel(request.getParameter("model"));
            basket.setSmodel(request.getParameter("smodel"));
            basket.setCost(Integer.parseInt(request.getParameter("cost")));
            basket.setTypeProduct(request.getParameter("type"));
            controllerBasket.insert(basket);
            Basket bb = new Basket();
            bb = controllerBasket.getById(basket.getIdProduct());
            p.addProduct(controllerBasket.getById(basket.getIdProduct()));
            p.products();
            session.setAttribute("productBasket", p);
            out.print("Add");
        }
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        process(request,response);
        request.getRequestDispatcher(request.getContextPath() + "/galery/bikes/bikes.jsp").forward(request,response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response){
        ArrayList<Bike> galleryBikes = new ArrayList<>();
        ServletContext servletContext = request.getServletContext();
        ControllerDAOBike controllerDAOBike = (ControllerDAOBike) servletContext.getAttribute("controllerDAOBike");

        galleryBikes = controllerDAOBike.getAll();
        request.setAttribute("allbikes", galleryBikes);
    }

}
