package com.jf.menu.services;

import com.jf.menu.entities.owner.AuhtReponseDTO;
import com.jf.menu.entities.owner.LoginDto;
import com.jf.menu.entities.owner.RegisterDto;

public interface OwnerService {

    AuhtReponseDTO login(LoginDto loginDto);

    AuhtReponseDTO register(RegisterDto registerDto);

}
