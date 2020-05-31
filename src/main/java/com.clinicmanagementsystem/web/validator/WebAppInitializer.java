package com.clinicmanagementsystem.web.validator;

import com.clinicmanagementsystem.service.config.ServiceConfig;
import com.clinicmanagementsystem.web.config.WebConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class <?>[] getRootConfigClasses() {
        return new Class[] {ServiceConfig.class};
    }

    @Override
    protected Class <?>[] getServletConfigClasses() {
        return new Class[] {WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

}