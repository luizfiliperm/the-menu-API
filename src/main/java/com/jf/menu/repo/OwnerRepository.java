package com.jf.menu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.jf.menu.entities.owner.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
    
    UserDetails findByEmail(String email);

    Boolean existsByEmail(String email);
}
