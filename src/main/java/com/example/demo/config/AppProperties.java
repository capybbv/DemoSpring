//package com.example.demo.config;
//
//import java.util.ArrayList;
//import java.util.List;
//import lombok.Getter;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//
//@Getter
//@ConfigurationProperties(prefix = "app")
//public class AppProperties {
//  private final Auth auth = new Auth();
//
//  public static class Auth {
//    @Value("${app.auth.tokenSecret}")
//    private String tokenSecret;
//
//    @Value("${app.auth.tokenExpirationMsec}")
//    private long tokenExpirationMsec;
//
//    @Value("${app.auth.refreshTokenExpirationMsec}")
//    private long refreshTokenExpirationMsec;
//
//    public String getTokenSecret() {
//      return tokenSecret;
//    }
//
//    public void setTokenSecret(String tokenSecret) {
//      this.tokenSecret = tokenSecret;
//    }
//
//    public long getTokenExpirationMsec() {
//      return tokenExpirationMsec;
//    }
//
//    public void setTokenExpirationMsec(long tokenExpirationMsec) {
//      this.tokenExpirationMsec = tokenExpirationMsec;
//    }
//
//    public long getRefreshTokenExpirationMsec() {
//      return refreshTokenExpirationMsec;
//    }
//
//    public void setRefreshTokenExpirationMsec(long refreshTokenExpirationMsec) {
//      this.refreshTokenExpirationMsec = refreshTokenExpirationMsec;
//    }
//  }
//}
