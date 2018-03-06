package warmStar;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


@WebServlet(name = "WarmStar", urlPatterns = "/warmStar",loadOnStartup = 0)
public class WarmStar extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processCar(request, response);
        processBike(request, response);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    private void processCar(HttpServletRequest request, HttpServletResponse response){
        ArrayList<Car> arrayList = new ArrayList<>();
        ServletContext servletContext = request.getServletContext();
        ControllerCar controllerCar = (ControllerCar) servletContext.getAttribute("controllerCar");

        Car car = controllerCar.getById(controllerCar.getIDCar("Tesla","S"));
        arrayList.add(car);

        car = controllerCar.getById(controllerCar.getIDCar("Audi","A4"));
        arrayList.add(car);

        car = controllerCar.getById(controllerCar.getIDCar("Ferrari","488"));
        arrayList.add(car);

        car = controllerCar.getById(controllerCar.getIDCar("Ford Mustang","VFS 5"));
        arrayList.add(car);

        car = controllerCar.getById(controllerCar.getIDCar("Lexus","RS"));
        arrayList.add(car);

        request.setAttribute("cars", arrayList);
    }

    private void processBike(HttpServletRequest request, HttpServletResponse response){
        ArrayList<Bike> arrayList = new ArrayList<>();
        ServletContext servletContext = request.getServletContext();
        ControllerDAOBike controllerDAOBike = (ControllerDAOBike) servletContext.getAttribute("controllerDAOBike");

        if(controllerDAOBike.checkBikeModel("State Bicycle", "MTB") && controllerDAOBike.checkBikeModel("Vossen","SV") && controllerDAOBike.checkBikeModel("State Bicycle","Ashford")
                && controllerDAOBike.checkBikeModel("State Bicycle","Black Label V2") && controllerDAOBike.checkBikeModel("State Bicycle","Simpsons X")){
            Bike bike = controllerDAOBike.getById(controllerDAOBike.getIDBike("State Bicycle","MTB"));
            arrayList.add(bike);

            bike = controllerDAOBike.getById(controllerDAOBike.getIDBike("Vossen","SV"));
            arrayList.add(bike);

            bike = controllerDAOBike.getById(controllerDAOBike.getIDBike("State Bicycle","Ashford"));
            arrayList.add(bike);

            bike = controllerDAOBike.getById(controllerDAOBike.getIDBike("State Bicycle","Black Label V2"));
            arrayList.add(bike);

            bike = controllerDAOBike.getById(controllerDAOBike.getIDBike("State Bicycle","Simpsons X"));
            arrayList.add(bike);

            request.setAttribute("bikes", arrayList);
        }
    }
}
