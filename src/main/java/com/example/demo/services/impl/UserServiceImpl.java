package com.example.demo.services.impl;

import com.example.demo.models.User;
import com.example.demo.payload.user.CreateUserReq;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UserServiceImpl implements UserService {
  private static final Logger logger = LogManager.getLogger(UserService.class);
  private final UserRepository userRepo;

  public UserServiceImpl(UserRepository userRepo) {
    this.userRepo = userRepo;
  }

  /**
   * @param request
   */
  @Override
  public void create(CreateUserReq request) {
    User user =
        new User(
            request.getName(), request.getUsername(), request.getPassword(), request.getEmail());
  }
}
