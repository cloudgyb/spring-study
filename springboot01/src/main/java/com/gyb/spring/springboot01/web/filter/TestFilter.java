package com.gyb.spring.springboot01.web.filter;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.*;
import java.io.IOException;

public class TestFilter implements Filter {
    private Log  log = LogFactory.getLog(TestFilter.class);

    @Override
    public void init(FilterConfig filterConfig) {
        log.info("TestFilter init....");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("TestFilter start");
        filterChain.doFilter(servletRequest,servletResponse);
        log.info("TestFilter end");
    }

    @Override
    public void destroy() {
        log.info("TestFilter destroy....");
    }
}
