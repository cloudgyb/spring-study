package com.gyb.spring.springboot01.web.filter;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.*;
import java.io.IOException;

public class TestFilter2 implements Filter {
    private Log  log = LogFactory.getLog(TestFilter2.class);

    @Override
    public void init(FilterConfig filterConfig) {
        log.info("TestFilter2 init....");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("TestFilter2 start");
        filterChain.doFilter(servletRequest,servletResponse);
        log.info("TestFilter2 end");
    }

    @Override
    public void destroy() {
        log.info("TestFilter2 destroy....");
    }
}
