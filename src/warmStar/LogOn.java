package warmStar;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "LogOn",urlPatterns = "/logOn")
public class LogOn extends HttpServlet {
    public void init(){
//        c = new ControllerMySQL();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        ControllerMySQL c = (ControllerMySQL) servletContext.getAttribute("controllerUser");
        Product productBasket = new Product();
        ErrorLogOn errorLogOn = new ErrorLogOn();
//        String login = request.getParameter("login");
//        String password = request.getParameter("password");
        String login = (String) request.getAttribute("login");
        String password = (String) request.getAttribute("password");
        errorLogOn.checkNickName(login);
        errorLogOn.checkPassword(password);
        if(errorLogOn.getValidate()) {
            System.out.println(login + " это в LOGON");
            System.out.println(password + " это в LOGON");
            System.out.println(login + " это в LOGON " + password);
            if (login != null && password != null) {
                if (c.validationUser(login, password)) {
                    HttpSession session = request.getSession(true);
//                    session.setAttribute("productBasket", productBasket);
//                    session.setAttribute("login", login);
//                    session.setAttribute("password", password);
                    System.out.println(session.getId());
                    if (session.getAttribute("user") == null) {
                        System.out.println("User was by null");
                        int id = c.getIdUser(login);
                        System.out.println("ID " + id);
                        if (id > 0) {
                            session.setAttribute("user", c.getById(id));
                            getProductBasket(request,productBasket, id);
                            session.setAttribute("productBasket", productBasket);
                            System.out.println(productBasket.getLength());
                            productBasket.products();
                            System.out.println("Create user and product and put to session");
                        }
                    }
                    response.sendRedirect(request.getContextPath() + "/yourOffice");
                    System.out.println("Work in LogOn SEND REDIRECT");
                } else {
                    request.getRequestDispatcher("/LogOn.jsp").forward(request, response);
                    System.out.println("request Dispatcher in the LogOn");
                }
                System.out.println(login + password);
            }
//            System.out.println(login + password);
        }else{
            request.setAttribute("error", errorLogOn.getMapError());
            request.getRequestDispatcher("/LogOn.jsp").forward(request,response);
            System.out.println("Work error in LogOn");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Pered-LogOn");
        request.getRequestDispatcher("LogOn.jsp").forward(request,response);
        System.out.println("WORK-LogOn");
    }

    private void getProductBasket(HttpServletRequest request, Product product, int userID){
        ServletContext servletContext = request.getServletContext();
        ControllerBasket basket = (ControllerBasket)servletContext.getAttribute("controllerBasket");
        product.addAllProduct(basket.getAllIDUser(userID));
        System.out.println("Otrabotal getProductBasket ");
    }
}
