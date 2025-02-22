package com.edigest.journalApp.service;

import com.edigest.journalApp.entity.User;
import com.edigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;
   @Test
    public void testFindByUserName(){
        User user=userRepository.findByusername("Ram");
        assertTrue(!user.getJournalEntries().isEmpty());
    }
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,10,12",
            "3,3,9"

    })
    public void test(int a, int b, int expected){
        assertEquals(expected,a+b);
    }
}
