package warmStar;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.Enumeration;

@WebFilter(filterName = "FilterTrim")
public class FilterTrim implements Filter {
    private FilterConfig filterConfig = null;
    public void destroy() {
        this.filterConfig = null;
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        Enumeration enumeration = req.getParameterNames();
        while (enumeration.hasMoreElements()){
            String parameterName = (String) enumeration.nextElement();
            String parameterValue = req.getParameter(parameterName);
            req.setAttribute(parameterName,parameterValue.trim());
        }
        chain.doFilter(req,resp);
    }

    public void init(FilterConfig config) throws ServletException {
        this.filterConfig = config;
    }

}
