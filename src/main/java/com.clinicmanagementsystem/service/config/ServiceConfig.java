package com.clinicmanagementsystem.service.config;

import com.clinicmanagementsystem.dao.config.DaoConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan ("com.clinicmanagementsystem.service")
@Import (DaoConfig.class)
public class ServiceConfig {

}
