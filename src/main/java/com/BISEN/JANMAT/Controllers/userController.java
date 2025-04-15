package com.BISEN.JANMAT.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BISEN.JANMAT.Services.userService;
import com.BISEN.JANMAT.modelsPackage.User;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin("http://localhost:4200")
@RequestMapping("/user")
@RestController
public class userController {
    @Autowired
    private userService userServ;

    @GetMapping("/{identity}")
    public ResponseEntity<User> getUserbyId(@PathVariable Long identity) {
        return ResponseEntity.ok(userServ.getUserById(identity));
    }
    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok(userServ.getAllusers());
    }
    
    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user){
        return ResponseEntity.ok(userServ.createUser(user));
    }

    @PutMapping("/{identity}")
    public ResponseEntity<User> updateUserById(@PathVariable Long id, User user){
        return ResponseEntity.ok(userServ.updateUser(id, user));
    }

    @DeleteMapping("/{identity}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        userServ.deleteUser(id);
        return ResponseEntity.ok("User Deleted Successfully");
    }
}
