package com.developergabs.gateway_pagamentos.controller;

import com.developergabs.gateway_pagamentos.dto.UserRequest;
import com.developergabs.gateway_pagamentos.entity.User;
import com.developergabs.gateway_pagamentos.repository.UserRepository;
import com.developergabs.gateway_pagamentos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> registerUser(@RequestBody UserRequest userRequest){
        User user = userRequest.toModel();
        User userSaved = userService.registedUser(user);
        return ResponseEntity.ok().body(userSaved);
    }

}
