package com.BISEN.JANMAT.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BISEN.JANMAT.modelsPackage.user;
import com.BISEN.JANMAT.repositoryPackage.userRepository;

@Service
public class userService{

    @Autowired
    private userRepository userRepo;

    public user getuserByid(Long Id){
        return userRepo.getReferenceById(Id);
    }
    
}