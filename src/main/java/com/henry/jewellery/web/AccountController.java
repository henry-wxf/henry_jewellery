package com.henry.jewellery.web;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    
    @RequestMapping("/me")
    public Principal user(Principal user) {
      return user;
    }
}
