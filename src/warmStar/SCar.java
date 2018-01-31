package warmStar;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SCar", urlPatterns = "/galery/bikes/products/car")
public class SCar extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("This is a Servlet car");
        procces(request);
        request.getRequestDispatcher(request.getContextPath() + "/galery/bikes/products/bike.jsp").forward(request,response);
//        response.sendRedirect(request.getContextPath()+"/galery/bikes/products/bike.jsp");
    }


    private void procces(HttpServletRequest request){
        ServletContext servletContext = request.getServletContext();
        Car car;
        ControllerCar controllerCar = (ControllerCar) servletContext.getAttribute("controllerCar");
        System.out.println(request.getParameter("id") + "sdsdsdsdssdsdsds" + request.getParameter("model") + " rrrrv " + request.getParameter("smodel"));
        controllerCar.getById(Integer.parseInt(request.getParameter("id")));
        if(controllerCar.checkCarModel(request.getParameter("model"),request.getParameter("smodel"))){
            car = controllerCar.getById(Integer.parseInt(request.getParameter("id")));
            request.setAttribute("car", car);
        }
    }
}
