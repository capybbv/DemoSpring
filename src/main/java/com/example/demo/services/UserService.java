package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.payload.user.CreateUserReq;
import com.example.demo.payload.user.CreateUserRes;
import com.example.demo.repositories.UserRepository;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.Optional;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {

  void create(CreateUserReq request);
}
