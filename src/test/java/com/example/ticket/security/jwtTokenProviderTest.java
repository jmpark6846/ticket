package com.example.ticket.security;

import com.example.ticket.config.security.JwtTokenProvider;
import com.example.ticket.data.entity.User;
import com.example.ticket.data.repository.UserRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class jwtTokenProviderTest {

    @Autowired
    private JwtTokenProvider jwtTokenProvider;

    @Autowired
    private static UserRepository userRepository;

    private static User user;

    @BeforeAll
    public static void beforeAll(){
        User u = User.builder()
                .uid("user")
                .password("password")
                .name("username")
                .build();

        user = u;
        userRepository.save(user);
    }

    @Test
    public void testCreateToken(){
        System.out.println(jwtTokenProvider.createToken(user.getUid(), user.getRoles()));

    }

}
