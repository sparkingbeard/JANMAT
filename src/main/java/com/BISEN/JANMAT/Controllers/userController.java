package com.BISEN.JANMAT.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BISEN.JANMAT.Services.userService;
import com.BISEN.JANMAT.modelsPackage.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@CrossOrigin("http://localhost:8080")
@RequestMapping("/user")
@RestController
public class userController {
    @Autowired
    private userService userServ;

    
    
    @GetMapping("/{identity}")
    public ResponseEntity<user> getUserbyId(@PathVariable Long identity){
         return ResponseEntity.ok(userServ.getuserByid(identity));
    }

}
