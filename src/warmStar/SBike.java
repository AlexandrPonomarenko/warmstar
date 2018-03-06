package warmStar;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SBike", urlPatterns = "/galery/bikes/products/bike")
public class SBike extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        procces(request,response);
        request.getRequestDispatcher(request.getContextPath() + "/galery/bikes/products/bike.jsp").forward(request,response);
    }

    private void procces(HttpServletRequest request, HttpServletResponse response){
        ServletContext servletContext = request.getServletContext();
        Bike bike;
        ControllerDAOBike controllerDAOBike = (ControllerDAOBike) servletContext.getAttribute("controllerDAOBike");
         controllerDAOBike.getById(Integer.parseInt(request.getParameter("id")));
        if(controllerDAOBike.checkBikeModel(request.getParameter("model"),request.getParameter("smodel"))){
            bike = controllerDAOBike.getById(Integer.parseInt(request.getParameter("id")));
            request.setAttribute("bike", bike);
        }
    }
}
