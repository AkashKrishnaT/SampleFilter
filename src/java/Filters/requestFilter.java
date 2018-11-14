package Filters;

import java.io.*;
import javax.servlet.*;

public class requestFilter implements Filter {

@Override
public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain)throws IOException, ServletException {

response.getWriter().println("BEFORE");
chain.doFilter(request,response);
response.getWriter().println("AFTER");
}

@Override
public void init(FilterConfig  filterConfig) throws ServletException{

}

@Override
public void destroy() {

}

}