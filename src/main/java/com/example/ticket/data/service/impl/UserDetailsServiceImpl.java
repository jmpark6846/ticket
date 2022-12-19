package com.example.ticket.data.service.impl;

import com.example.ticket.data.dto.UserDto;
import com.example.ticket.data.entity.User;
import com.example.ticket.data.repository.UserRepository;
import com.example.ticket.data.service.UserDetailsSerivce;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Log
@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsSerivce {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getByUid(username);

        log.info("loadUserByUsername: " + username);

        UserDto dto = new UserDto(
                user.getUid(),
                user.getPassword(),
                List.of(new SimpleGrantedAuthority("ROLE_USER"))
        );

        log.info(dto.toString());
        return dto;

    }
}
