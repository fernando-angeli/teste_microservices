package com.example.demoapigateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teste")
public class GatewayController {

    @GetMapping
    public ResponseEntity<String> teste(){
        return ResponseEntity.ok().body("Gateway rodando.");
    }
}
