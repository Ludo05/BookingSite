package com.spring.myWebsite;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInit extends
        AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootAppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {MainWebConfig.class,ApiWebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/main/*","/api/*"};
    }
}
