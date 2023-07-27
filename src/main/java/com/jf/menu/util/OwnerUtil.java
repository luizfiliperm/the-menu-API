package com.jf.menu.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class OwnerUtil {
    
    public static String encrpytPassword(String password) {
        return new BCryptPasswordEncoder().encode(password);
    }
}
