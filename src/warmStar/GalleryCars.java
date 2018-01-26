package warmStar;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "GalleryCars", urlPatterns = "/galery/cars")
public class GalleryCars extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in gallery Cars");
        System.out.println(request.getContextPath() + " vvv " + request.getServletPath() + " vv " + request.getRequestURI());
        process(request,response);

        request.getRequestDispatcher(request.getContextPath() + "/galery/cars/cars.jsp").forward(request,response);
    }

    private void process(HttpServletRequest request, HttpServletResponse response){
        ArrayList<Car> galleryCars = new ArrayList<>();
        ServletContext servletContext = request.getServletContext();
        ControllerCar controllerCar = (ControllerCar) servletContext.getAttribute("controllerCar");
        galleryCars = controllerCar.getAll();
        request.setAttribute("allcars", galleryCars);
    }
}
