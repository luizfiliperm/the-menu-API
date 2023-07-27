package com.jf.menu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jf.menu.entities.owner.AuhtReponseDTO;
import com.jf.menu.entities.owner.RegisterDto;
import com.jf.menu.services.OwnerService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    OwnerService ownerService;

    @PostMapping("/register")
        public ResponseEntity<AuhtReponseDTO> register(@RequestBody RegisterDto registerDto) {
        return ResponseEntity.ok(ownerService.register(registerDto));
    }

}
