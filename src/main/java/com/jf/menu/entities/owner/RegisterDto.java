package com.jf.menu.entities.owner;

public record RegisterDto(String email, String firstName, String lastName, String password) {

    public RegisterDto(Owner owner){
        this(owner.getEmail(), owner.getFirstName(), owner.getLastName(), owner.getPassword());
    }
    
}
