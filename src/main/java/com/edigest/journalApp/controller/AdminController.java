package com.edigest.journalApp.controller;

import com.edigest.journalApp.cache.Appcache;
import com.edigest.journalApp.entity.User;
import com.edigest.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private Appcache appcache;

    @GetMapping("/all-users")
    public ResponseEntity<?> getAllusers() {
        List<User> all = userService.getAll();
        if (all != null && !all.isEmpty()) {
            return new ResponseEntity<>(all, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/create-admin-user")
    public void creteuser(@RequestBody User user){
        userService.saveAdmin(user);
    }

    @GetMapping("/clear-cache")
    public void clearAppCache(){
        appcache.init();
    }
}
