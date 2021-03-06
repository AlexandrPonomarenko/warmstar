package warmStar;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "FilterCheckOrder")
public class FilterCheckOrder implements Filter {
    FilterConfig filterConfig;
    public void destroy() {
        filterConfig = null;
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        HttpSession session = request.getSession(false);
        Product p = (Product)session.getAttribute("productBasket");
        String url = request.getRequestURI();
        if(filterConfig.getInitParameter("active").equals("true")) {
            if(session.getAttribute("user") != null) {
                if (url.equals("/youroffice/order")) {
                    if (p.getLength() > 0 && session.getAttribute("order") != null && session.getAttribute("city") != null && session.getAttribute("address") != null) {
                        chain.doFilter(req,resp);
                        return;
                    }else{
                        response.sendRedirect(request.getContextPath()+"/youroffice/basket");
                    }
                }else if(url.equals("/youroffice/success")){
                    if( p.getLength() > 0 && session.getAttribute("order") != null &&  session.getAttribute("orderTwo") != null && session.getAttribute("city") != null && session.getAttribute("address") != null){
                        chain.doFilter(req,resp);
                        return;
                    }else{
                        response.sendRedirect(request.getContextPath()+"/youroffice/order");
                    }
                }
            }
        }
    }

    public void init(FilterConfig config) throws ServletException {
        filterConfig = config;
    }

}
