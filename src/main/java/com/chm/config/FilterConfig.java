package com.chm.config;

import com.chm.dangdang.ddframe.job.lite.console.filter.GlobalConfigurationFilter;
import com.dangdang.ddframe.job.security.WwwAuthFilter;
import javax.servlet.DispatcherType;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

  @Bean
  public FilterRegistrationBean globalConfigurationFilter() {
    FilterRegistrationBean registrationBean = new FilterRegistrationBean();
    GlobalConfigurationFilter globalConfigurationFilter = new GlobalConfigurationFilter();
    registrationBean.setFilter(globalConfigurationFilter);
    registrationBean.setOrder(1);
    registrationBean.addUrlPatterns("*.html");
    registrationBean.setDispatcherTypes(DispatcherType.REQUEST);
    return registrationBean;
  }

  @Bean
  public FilterRegistrationBean wwwAuthFilter() {
    FilterRegistrationBean registrationBean = new FilterRegistrationBean();
    WwwAuthFilter wwwAuthFilter = new WwwAuthFilter();
    registrationBean.setFilter(wwwAuthFilter);
    registrationBean.setOrder(2);
    registrationBean.addUrlPatterns("/api/*", "*.html");
    registrationBean.setDispatcherTypes(DispatcherType.REQUEST);
    return registrationBean;
  }

}
