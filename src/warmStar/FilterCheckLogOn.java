package warmStar;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "FilterCheckLogOn")
public class FilterCheckLogOn implements Filter {
    private FilterConfig filterConfig;

    public void destroy() {
        filterConfig = null;
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest  request = (HttpServletRequest)req;
        HttpServletResponse  response = (HttpServletResponse)resp;
        HttpSession session = request.getSession(false);
        String url = "/galery/bikes";
        if(session != null) {
        }else {
        }
        if(filterConfig.getInitParameter("active").equals("true")){
            if(session == null || session.getAttribute("user") == null){
                response.sendRedirect(request.getContextPath()+"/logOn");
            }else if (session != null && session.getAttribute("user") != null){
                User uu = (User) session.getAttribute("user");
                chain.doFilter(req, resp);
            }
        }
    }

    public void init(FilterConfig config) throws ServletException {
        filterConfig = config;
    }

}
