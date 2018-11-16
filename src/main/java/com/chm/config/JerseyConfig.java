package com.chm.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {
  /**
   * 扫描com.os.china包，使其识别JAX-RS注解
   */
  public JerseyConfig() {
    packages("com.chm.dangdang");
    property(ServletProperties.FILTER_FORWARD_ON_404, true);
  }
}
