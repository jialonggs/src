package com.jialong.jlmanager.filterUtil;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName="CORSFilter",urlPatterns="/*")
public class CORSFilter implements Filter{

    @Override
    public void destroy() {
        System.out.println("=====>销毁");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,FilterChain chain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) res;
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        System.out.println("=====>经过");
        chain.doFilter(req,response);
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        System.out.println("=====>启动");
    }

}
