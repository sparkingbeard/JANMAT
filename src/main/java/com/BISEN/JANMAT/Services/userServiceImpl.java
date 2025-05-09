package com.BISEN.JANMAT.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BISEN.JANMAT.modelsPackage.User;
import com.BISEN.JANMAT.repositoryPackage.UserRepository;

@Service
public class userServiceImpl implements userService{

    @Autowired
    private UserRepository userRepo;
    
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
    public User updateUserById(Long id, User updatedUser) {
        User existing = userRepo.findById(id).orElse(null);
        if(existing!= null){
             existing.setUserName( updatedUser.getUserName());
             existing.setEmail( updatedUser.getEmail());
             existing.setPassword(updatedUser.getPassword());
             existing.setRole( updatedUser.getRole());
             existing.setCreatedAt(updatedUser.getCreatedAt());
             return userRepo.save(existing);
        }
        return null;
    }
    @Override
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
    
}