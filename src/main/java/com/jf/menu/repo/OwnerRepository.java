package com.jf.menu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.jf.menu.entities.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
    
    UserDetails findByEmail(String email);
}
