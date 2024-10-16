package com.developergabs.gateway_pagamentos.dto;

import com.developergabs.gateway_pagamentos.entity.User;

public record UserRequest(String name, String email, String password) {

    public User toModel() {
        return new User(name, email, password);
    }
}
