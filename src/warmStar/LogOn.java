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
        String login = (String) request.getAttribute("login");
        String password = (String) request.getAttribute("password");
        errorLogOn.checkNickName(login);
        errorLogOn.checkPassword(password);
        if(errorLogOn.getValidate()) {
            if (login != null && password != null) {
                if (c.validationUser(login, password)) {
                    HttpSession session = request.getSession(true);
                    if (session.getAttribute("user") == null) {
                        int id = c.getIdUser(login);
                        if (id > 0) {
                            session.setAttribute("user", c.getById(id));
                            getProductBasket(request,productBasket, id);
                            session.setAttribute("productBasket", productBasket);
                            productBasket.products();
                        }
                    }
                    response.sendRedirect(request.getContextPath() + "/yourOffice");
                } else {
                    request.getRequestDispatcher("/LogOn.jsp").forward(request, response);
                }
            }
        }else{
            request.setAttribute("error", errorLogOn.getMapError());
            request.getRequestDispatcher("/LogOn.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("LogOn.jsp").forward(request,response);
    }

    private void getProductBasket(HttpServletRequest request, Product product, int userID){
        ServletContext servletContext = request.getServletContext();
        ControllerBasket basket = (ControllerBasket)servletContext.getAttribute("controllerBasket");
        product.addAllProduct(basket.getAllIDUser(userID));
    }
}
