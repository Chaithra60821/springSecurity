package com.example.springbootSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

  @GetMapping("/")
  public String welcome(){
    return "Welcome";
  }

  @GetMapping("/user")
  public String welcomeUser(){
    return "Welcome User";
  }

  @GetMapping("/admin")
  public String welcomeAdmin(){
    return "Welcome Admin";
  }

}
