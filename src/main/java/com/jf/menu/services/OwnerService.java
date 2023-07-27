package com.jf.menu.services;

import com.jf.menu.entities.owner.RegisterDto;

public interface OwnerService {

    String login(String email, String password);

    String register(RegisterDto registerDto);

}
