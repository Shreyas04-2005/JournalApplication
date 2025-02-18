package com.edigest.journalApp.service;

import com.edigest.journalApp.repository.UserRepository;
import com.mongodb.assertions.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.ArrayList;

import java.util.ArrayList;

import static org.mockito.Mockito.*;


public class UserDetailsServiceImplTest {

    @InjectMocks
    private UserDetailsServiceImpl userDetailsService;

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
    }


//    @Test
//    void loadUserByUsernameTest(){
//         when(userRepository.findByusername(ArgumentMatchers.anyString())).thenReturn((com.edigest.journalApp.entity.User) User.builder().username("Ram").password("TTVVsisg").build());
//        UserDetails user=userDetailsService.loadUserByUsername("Ram");
//        Assertions.assertNotNull(user);
//
//    }
    //Mockito does not required junit for testing
}
