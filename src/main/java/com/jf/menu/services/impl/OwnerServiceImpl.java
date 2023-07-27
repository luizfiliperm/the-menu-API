package com.jf.menu.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jf.menu.entities.owner.AuhtReponseDTO;
import com.jf.menu.entities.owner.LoginDto;
import com.jf.menu.entities.owner.Owner;
import com.jf.menu.entities.owner.RegisterDto;
import com.jf.menu.entities.owner.enums.UserRole;
import com.jf.menu.infra.security.TokenService;
import com.jf.menu.repo.OwnerRepository;
import com.jf.menu.services.OwnerService;
import com.jf.menu.util.OwnerUtil;

@Service
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    OwnerRepository ownerRepository;

    @Autowired
    TokenService tokenService;

    @Override
    public AuhtReponseDTO login(LoginDto loginDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    @Override
    public AuhtReponseDTO register(RegisterDto registerDto) {

        if (ownerRepository.existsByEmail(registerDto.email())) {
            throw new IllegalArgumentException("Email already registered");
        }

        Owner owner = new Owner(registerDto.email(), registerDto.firstName(), registerDto.lastName(), OwnerUtil.encrpytPassword(registerDto.password()));

        owner.setRole(UserRole.USER);

        ownerRepository.save(owner);

        String token = generateToken(owner);

        return new AuhtReponseDTO("User registered successfully", token, owner);
    }
    
    private String generateToken(Owner owner) {
        return tokenService.genToken(owner);
    }
}
