// package com.example.demo.services.impl;
//
// import com.example.demo.payload.auth.AuthResponse;
// import com.example.demo.repositories.RefreshTokenRepository;
// import com.example.demo.repositories.UserRepository;
// import com.example.demo.sercurity.TokenProvider;
// import com.example.demo.services.AuthService;
// import java.util.Date;
// import lombok.RequiredArgsConstructor;
// import org.springframework.stereotype.Service;
//
// @Service
// @RequiredArgsConstructor
// public class AuthServiceImpl implements AuthService {
//  private final UserRepository userRepository;
//  private final RefreshTokenRepository refreshTokenRepository;
//  private final TokenProvider tokenProvider;
//
//  @Override
//  public AuthResponse createToken(String userId) {
//    Date now = new Date();
//    Date expiryDate = new Date(now.getTime() + 1);
//    return new AuthResponse("token", expiryDate.toString(), "Bearer");
//  }
// }
