package com.codingz2m.bloggingplatform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingz2m.bloggingplatform.model.BlogUser;
import com.codingz2m.bloggingplatform.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody BlogUser blogUser) {
        if (userService.findUserByUsername(blogUser.getUsername()) != null) {
            return new ResponseEntity<>("Username is already taken!", HttpStatus.BAD_REQUEST);
        }
        userService.createUser(blogUser);
        return new ResponseEntity<>("User registered successfully!", HttpStatus.OK);
    }

  
    @PostMapping("/login")
    public ResponseEntity<String> loginUser( @RequestBody BlogUser blogUser) {
        BlogUser savedBlogUser = userService.findUserByUsername(blogUser.getUsername());
        if (savedBlogUser == null || !savedBlogUser.getPassword().equals(blogUser.getPassword())) {
            return new ResponseEntity<>("Invalid username or password", HttpStatus.UNAUTHORIZED);
        }
        return ResponseEntity.ok("User logged in successfully!");
    }


}

