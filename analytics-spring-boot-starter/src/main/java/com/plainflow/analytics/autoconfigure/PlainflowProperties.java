package com.plainflow.analytics.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for the Plainflow Analytics client. Since the client
 * only supports writes at this point, the secret key is the only (and required)
 * property.
 *
 * @author Christopher Smith
 */
@ConfigurationProperties("plainflow.analytics")
public class PlainflowProperties {

  private String secretKey;

  public String getWriteKey() {
    return secretKey;
  }

  public void setWriteKey(String secretKey) {
    this.secretKey = secretKey;
  }
}
