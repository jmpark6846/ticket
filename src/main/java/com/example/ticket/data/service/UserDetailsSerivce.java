package com.example.ticket.data.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsSerivce {
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
