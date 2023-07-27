package com.jf.menu.entities.owner;

public record AuhtReponseDTO(String message, String token, String email, String firstName, String lastName) {

    public AuhtReponseDTO(String message,String token, Owner owner) {
        this(message,token, owner.getEmail(), owner.getFirstName(), owner.getLastName());
    }
}
