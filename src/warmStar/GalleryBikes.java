package warmStar;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "GalleryBikes", urlPatterns = "/galery/bikes")
public class GalleryBikes extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in gallery");
        System.out.println(request.getContextPath() + " vvv " + request.getServletPath() + " vv " + request.getRequestURI());
        process(request,response);

        request.getRequestDispatcher(request.getContextPath() + "/galery/bikes/bikes.jsp").forward(request,response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response){
        ArrayList<Bike> galleryBikes = new ArrayList<>();
        ServletContext servletContext = request.getServletContext();
        ControllerDAOBike controllerDAOBike = (ControllerDAOBike) servletContext.getAttribute("controllerDAOBike");

        galleryBikes = controllerDAOBike.getAll();
//        if(controllerDAOBike.checkBikeModel("State Bicycle", "MTB") && controllerDAOBike.checkBikeModel("Vossen","SV") && controllerDAOBike.checkBikeModel("State Bicycle","Ashford")
//                && controllerDAOBike.checkBikeModel("State Bicycle","Black Label V2") && controllerDAOBike.checkBikeModel("State Bicycle","Simpsons X")){
        request.setAttribute("allbikes", galleryBikes);
    }

}
