package com.jf.menu.entities.owner;

import com.jf.menu.entities.owner.enums.UserRole;

public record RegisterDto(String email, String firstName, String lastName, String password, UserRole role) {

    public RegisterDto(Owner owner){
        this(owner.getEmail(), owner.getFirstName(), owner.getLastName(), owner.getPassword(), owner.getRole());
    }
    
}
