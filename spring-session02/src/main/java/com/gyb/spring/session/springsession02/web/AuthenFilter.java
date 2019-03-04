package com.gyb.spring.session.springsession02.web;

import com.gyb.spring.session.springsession02.entity.User;
import org.springframework.beans.factory.annotation.Value;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashSet;

/**
 * @author gengyuanbo
 * 2019/02/28
 */
@WebFilter(urlPatterns = "/*")
public class AuthenFilter implements Filter {
    private HashSet<String> excludeUri = new HashSet<>();

    @Value("${server.port}")
    private String serverPort;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        excludeUri.add("/loginPage");
        excludeUri.add("/login");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String requestURI = request.getRequestURI();
        System.out.println("Authen Filter！服务端口："+serverPort);
        if(excludeUri.contains(requestURI)){
            filterChain.doFilter(request,response);
            return;
        }
        HttpSession session = request.getSession(false);
        if(session == null){
            request.getRequestDispatcher("/loginPage").forward(request,response);
        }else{
            User user = (User) session.getAttribute("_user");
            if(user == null){
                request.getRequestDispatcher("/loginPage").forward(request,response);
            }else
                filterChain.doFilter(request,response);
        }
    }
}
