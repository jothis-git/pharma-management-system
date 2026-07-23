package com.Basic.Services;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public String login(LoginRequest request) {

        return "JWT_TOKEN";
    }
}