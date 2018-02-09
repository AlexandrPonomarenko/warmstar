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

        HttpSession httpSession = request.getSession();
        if(httpSession == null){
            System.out.println("dsdsdsdsdsdsdsdsdsdsdsssdsdsdsdsdsds");
        }

        System.out.println("111 " + request.getContextPath() + " dddddd " + request.getRequestURI() + " rrr " + request.getServletPath());
        System.out.println("TYTYTYYTY");
        processCar(request, response);
        processBike(request, response);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }

    private void processCar(HttpServletRequest request, HttpServletResponse response){
        ArrayList<Car> arrayList = new ArrayList<>();
        ServletContext servletContext = request.getServletContext();
        ControllerCar controllerCar = (ControllerCar) servletContext.getAttribute("controllerCar");

        Car car = controllerCar.getById(controllerCar.getIDCar("Tesla","S"));
        System.out.println(car.getModel());
        arrayList.add(car);

        car = controllerCar.getById(controllerCar.getIDCar("Audi","A4"));
        System.out.println(car.getModel());
        arrayList.add(car);

        car = controllerCar.getById(controllerCar.getIDCar("Ferrari","488"));
        System.out.println(car.getModel());
        arrayList.add(car);

        car = controllerCar.getById(controllerCar.getIDCar("Ford Mustang","VFS 5"));
        System.out.println(car.getModel());
        arrayList.add(car);

        car = controllerCar.getById(controllerCar.getIDCar("Lexus","RS"));
        System.out.println(car.getModel());
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
            System.out.println(bike.getModel());
            arrayList.add(bike);

            bike = controllerDAOBike.getById(controllerDAOBike.getIDBike("Vossen","SV"));
            System.out.println(bike.getModel());
            arrayList.add(bike);

            bike = controllerDAOBike.getById(controllerDAOBike.getIDBike("State Bicycle","Ashford"));
            System.out.println(bike.getModel());
            arrayList.add(bike);

            bike = controllerDAOBike.getById(controllerDAOBike.getIDBike("State Bicycle","Black Label V2"));
            System.out.println(bike.getModel());
            arrayList.add(bike);

            bike = controllerDAOBike.getById(controllerDAOBike.getIDBike("State Bicycle","Simpsons X"));
            System.out.println(bike.getModel());
            arrayList.add(bike);

            request.setAttribute("bikes", arrayList);
        }
    }
}
