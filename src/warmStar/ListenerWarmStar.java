package warmStar;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

@WebListener()
public class ListenerWarmStar implements ServletContextListener {

    // Public constructor is required by servlet spec
    public ListenerWarmStar() {
    }
//    HttpSessionListener, HttpSessionAttributeListener
    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
//      ControllerMySQL controllerMySQL = new ControllerMySQL();
//      ControllerCar controllerCar = new ControllerCar();
//      ControllerDAOBike controllerDAOBike = new ControllerDAOBike();

        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("controllerUser", new ControllerMySQL());
        servletContext.setAttribute("controllerCar", new ControllerCar());
        servletContext.setAttribute("controllerDAOBike", new ControllerDAOBike());
        servletContext.setAttribute("controllerBasket", new ControllerBasket());

    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("contextDestroyed");
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
//    public void sessionCreated(HttpSessionEvent se) {
//      /* Session is created. */
//        System.out.println("sessionCreated");
//    }
//
//    public void sessionDestroyed(HttpSessionEvent se) {
//      /* Session is destroyed. */
//        System.out.println("sessionDestroyed");
//    }
//
//    // -------------------------------------------------------
//    // HttpSessionAttributeListener implementation
//    // -------------------------------------------------------
//
//    public void attributeAdded(HttpSessionBindingEvent sbe) {
//      /* This method is called when an attribute
//         is added to a session.
//      */
//    }
//
//    public void attributeRemoved(HttpSessionBindingEvent sbe) {
//      /* This method is called when an attribute
//         is removed from a session.
//      */
//    }
//
//    public void attributeReplaced(HttpSessionBindingEvent sbe) {
//      /* This method is invoked when an attibute
//         is replaced in a session.
//      */
//    }
}
