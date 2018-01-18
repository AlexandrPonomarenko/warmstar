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
        System.out.println("FILTER FilterCheckLogOn ");
        HttpServletRequest  request = (HttpServletRequest)req;
        HttpServletResponse  response = (HttpServletResponse)resp;
        HttpSession session = request.getSession(false);
        String url = request.getContextPath() + "/yourOffice";
        if(session != null) {
            System.out.println(session + " NOT NULL");
        }else {
            System.out.println("null");
        }

        if(filterConfig.getInitParameter("active").equals("true")){
            System.out.println(filterConfig.getInitParameter("active") + "+++++++++++++++++++++++++++++++++");
            System.out.println("111 " + request.getContextPath() + " dddddd " + request.getRequestURI() + "rrr " + request.getServletPath());
            if(session == null || session.getAttribute("user") == null){
                System.out.println("===" + session);
                response.sendRedirect(request.getContextPath()+"/logOn");
            }else if (session != null && session.getAttribute("user") != null){
                User uu = (User) session.getAttribute("user");
                System.out.println(uu.toString());
//                System.out.println(uu.getPassword() + " +++++++++++++ " + uu.);
                String login =(String)session.getAttribute("login");
                String password =(String)session.getAttribute("password");
                System.out.println(login + " 44444444444444444444444 " +  password);
//                response.sendRedirect(url);
                chain.doFilter(req, resp);
            }
        }
//        chain.doFilter(req, resp);
        System.out.println("END");
    }

    public void init(FilterConfig config) throws ServletException {
        filterConfig = config;
    }

}
