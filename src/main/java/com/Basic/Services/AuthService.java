package com.Basic.Services;

import org.springframework.stereotype.Service;

import com.Basic.dto.LoginRequest;

@Service
public class AuthService {

    public String login(LoginRequest request) {

        return "AVAILABLE";
    }
}