package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.payload.user.CreateUserReq;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@Tag(name = "User APIs", description = "APIs for user handling")
public class UserController {
  private static final Logger logger = LogManager.getLogger(UserController.class);
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @Operation(summary = "Create user")
  @PostMapping(value = "/")
  public ResponseEntity<String> CreateUser(@RequestBody CreateUserReq user) {
    logger.info("Create user");
    userService.create(user);
    return ResponseEntity.ok("OK");
  }

  //  @GetMapping(value = "/{id}")
  //  public ResponseEntity<User> GetUser(@PathVariable("id") long id) {
  //    logger.info("Get user");
  //    Optional<User> user = userRepo.findById(id);
  //
  //    if (user.isEmpty()) {
  //      return ResponseEntity.notFound().build();
  //    }
  //    return ResponseEntity.ok(userRepo.findById(id).get());
  //  }
}
