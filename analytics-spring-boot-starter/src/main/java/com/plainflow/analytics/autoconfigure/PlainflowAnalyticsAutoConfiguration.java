package com.plainflow.analytics.autoconfigure;

import com.plainflow.analytics.Analytics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Boot autoconfiguration class for Plainflow Analytics.
 *
 * @author Christopher Smith
 */
@Configuration
@EnableConfigurationProperties(PlainflowProperties.class)
@ConditionalOnProperty("plainflow.analytics.secretKey")
public class PlainflowAnalyticsAutoConfiguration {

  @Autowired
  private PlainflowProperties properties;

  @Bean
  public Analytics plainflowAnalytics() {
    return Analytics.builder(properties.getWriteKey()).build();
  }
}
