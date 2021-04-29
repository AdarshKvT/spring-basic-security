package com.kvtsoft.springbasicsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noAuth")
public class NoAuthenticationController {

    @GetMapping("/user")
    public String userAccess() {
        return "Access granted without auth";
    }
}
