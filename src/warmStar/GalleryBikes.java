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
//            System.out.println(request.getParameter("cost"));
            out.print("Для того что бы добавить в корзину, Вам нужно авторизоваться.");
//            request.setAttribute("out", "Для того что бы добавить Вам нужно авторизоваться.");
        }else if(session.getAttribute("user")!= null){
            User user = (User)session.getAttribute("user");
            Product p = (Product)session.getAttribute("productBasket");
            Basket basket = new Basket();
            basket.setIdUser(user.getId());
            basket.setIdProduct(Integer.parseInt(request.getParameter("idproduct")));
//            int f = Integer.parseInt(request.getParameter("idproduct"));
//            System.out.println(" ---------------- " + f);
            basket.setModel(request.getParameter("model"));
            basket.setSmodel(request.getParameter("smodel"));
            basket.setCost(Integer.parseInt(request.getParameter("cost")));
            basket.setTypeProduct(request.getParameter("type"));
            controllerBasket.insert(basket);
            Basket bb = new Basket();
            bb = controllerBasket.getById(basket.getIdProduct());
            System.out.println("THIS IS bb "  + bb.toString());
//            bb.toString();
            p.addProduct(controllerBasket.getById(basket.getIdProduct()));
            System.out.println("THIS IS GALLERY bikes");
            p.products();
            session.setAttribute("productBasket", p);
            out.print("Добавлено");
            System.out.println(basket.toString());
        }
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in gallery");
        System.out.println(request.getContextPath() + " vvv " + request.getServletPath() + " vv " + request.getRequestURI());
        process(request,response);
        System.out.println("before gallery");
        request.getRequestDispatcher(request.getContextPath() + "/galery/bikes/bikes.jsp").forward(request,response);
        System.out.println("after gallery");
    }

    private void process(HttpServletRequest request, HttpServletResponse response){
        ArrayList<Bike> galleryBikes = new ArrayList<>();
        ServletContext servletContext = request.getServletContext();
        ControllerDAOBike controllerDAOBike = (ControllerDAOBike) servletContext.getAttribute("controllerDAOBike");

        galleryBikes = controllerDAOBike.getAll();
//        if(controllerDAOBike.checkBikeModel("State Bicycle", "MTB") && controllerDAOBike.checkBikeModel("Vossen","SV") && controllerDAOBike.checkBikeModel("State Bicycle","Ashford")
//                && controllerDAOBike.checkBikeModel("State Bicycle","Black Label V2") && controllerDAOBike.checkBikeModel("State Bicycle","Simpsons X")){
        request.setAttribute("allbikes", galleryBikes);
        System.out.println("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
    }

}
