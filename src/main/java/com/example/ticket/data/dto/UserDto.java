package com.example.ticket.data.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

@Getter
@Setter
@ToString
public class UserDto extends User {

    private String uid;
    private String password;

    public UserDto(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.uid = username;
        this.password = password;
    }
}
