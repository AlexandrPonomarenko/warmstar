package warmStar;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "BuyProduct",urlPatterns = "/buy")
public class BuyProduct extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in buy room post");
        boolean flag = false;
        ServletContext servletContext = request.getServletContext();
//        ControllerBasket controllerBasket = (ControllerBasket) servletContext.getAttribute("controllerBasket");
        Email email;
        HttpSession session = request.getSession(false);
        User user = (User)session.getAttribute("user");
        String city = request.getParameter("city");
        String address = request.getParameter("address");
//        email = new Email(user.getFirstName(), user.getLastName(), city, address);
        if(session.getAttribute("type").equals("bike")){
            System.out.println("post bike");
            servletContext = request.getServletContext();
            ControllerDAOBike controllerDAOBike = (ControllerDAOBike) servletContext.getAttribute("controllerDAOBike");
            Bike bike = (Bike)session.getAttribute("product");
//            controllerDAOBike.updateQ(bike.getId(), bike.getQuantity() - 1);
            email = new Email(user.getFirstName(), user.getEmail(), city, address, bike.getPrice(), "bike");
            email.sendEmail();
        }else if(session.getAttribute("type").equals("car")){
            System.out.println("post car");
            servletContext = request.getServletContext();
            ControllerCar controllerCar = (ControllerCar) servletContext.getAttribute("controllerCar");
            Car car = (Car)session.getAttribute("product");
//            controllerCar.updateQ(car.getId(), car.getQuantity() - 1);
            email = new Email(user.getFirstName(), user.getEmail(), city, address, car.getPrice(),"car");
            email.sendEmail();
        }
//        email.sendEmail();
        response.sendRedirect(request.getContextPath() + "/Access.html");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in buy room get");
        if(request.getParameter("type") != null){
            proccesBuy(request);
            request.getRequestDispatcher("/buy.jsp").forward(request,response);
        }else{
            request.getRequestDispatcher("/noProduct.jsp").forward(request,response);
        }

    }

    private void proccesBuy(HttpServletRequest request){
        ServletContext servletContext = request.getServletContext();
        HttpSession session = request.getSession(false);
        Car car;
        Bike bike;
        if (request.getParameter("type").equals("bike")) {
            System.out.println("PRISHOL bike");
            ControllerDAOBike controllerDAOBike = (ControllerDAOBike) servletContext.getAttribute("controllerDAOBike");
            System.out.println(request.getParameter("id") + "sdsdsdsdssdsdsds" + request.getParameter("model") + " rrrrv " + request.getParameter("smodel"));
            controllerDAOBike.getById(Integer.parseInt(request.getParameter("id")));
            if (controllerDAOBike.checkBikeModel(request.getParameter("model"), request.getParameter("smodel"))) {
                bike = controllerDAOBike.getById(Integer.parseInt(request.getParameter("id")));
                if (bike.getQuantity() > 0) {
                    request.setAttribute("product", bike);
                    session.setAttribute("type", "bike");
                    session.setAttribute("product", bike);
                } else {
                    request.setAttribute("error", "В данный момент этот велосипед купить нельзя");
                }
            }
        }else if (request.getParameter("type").equals("car")) {
            System.out.println("PRISHOL car");
            ControllerCar controllerCar = (ControllerCar) servletContext.getAttribute("controllerCar");
            System.out.println(request.getParameter("id") + "sdsdsdsdssdsdsds" + request.getParameter("model") + " rrrrv " + request.getParameter("smodel"));
            controllerCar.getById(Integer.parseInt(request.getParameter("id")));
            if (controllerCar.checkCarModel(request.getParameter("model"), request.getParameter("smodel"))) {
                car = controllerCar.getById(Integer.parseInt(request.getParameter("id")));
                if (car.getQuantity() > 0) {
                    request.setAttribute("product", car);
                    session.setAttribute("type", "car");
                    session.setAttribute("product", car);
                } else {
                    request.setAttribute("error", "В данный момент этот автомобиль купить нельзя");
                }
            }
        }

    }
}
