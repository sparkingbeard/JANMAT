package com.BISEN.JANMAT.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BISEN.JANMAT.modelsPackage.User;
import com.BISEN.JANMAT.repositoryPackage.userRepository;

@Service
public class userServiceImpl implements userService{

    @Autowired
    private userRepository userRepo;

    // public user getuserByid(Long Id){
    //     return userRepo.getReferenceById(Id);
    // }
    // public String createUser(user u){
    //     userRepo.save(u);
    //     return "User created successfully";
    // }
    // public String updateUser(Long Id, user u){
    //     UserRepo.add(Id, u);
    // }
    @Override
    public User createUser(User user) {
       return userRepo.save(user);
    }
    @Override
    public User getUserById(Long id) {
       return userRepo.findById(id).orElse(null);
    }
    @Override
    public List<User> getAllusers() {
        return userRepo.findAll();
    }
    @Override
    public User updateUser(Long id, User updatedUser) {
        User existing = userRepo.findById(id).orElse(null);
        if(existing!= null){
             existing.setUserName( updatedUser.getUserName());
             existing.setEmail( updatedUser.getEmail());
             existing.setPassword(updatedUser.getPassword());
             existing.setRole( updatedUser.getRole());
             existing.setCreatedAt(updatedUser.getCreatedAt());
        }
        return null;
    }
    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
    
}