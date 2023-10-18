package com.example.demo.payload.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CreateUserReq {
    private String name;
    private String username;
    private String password;
    private String email;
}
