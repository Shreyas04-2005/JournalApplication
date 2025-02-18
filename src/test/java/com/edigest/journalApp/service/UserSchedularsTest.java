package com.edigest.journalApp.service;

import com.edigest.journalApp.schedular.UserSchedular;
import net.bytebuddy.build.ToStringPlugin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserSchedularsTest {

    @Autowired
    private UserSchedular userSchedular;

    @Test
    public void testFetchUsersAndSendSaMail(){
        userSchedular.fetchUsersAndSendSaMail();
    }

}
