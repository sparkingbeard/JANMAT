package com.BISEN.JANMAT.Services;

import java.util.List;

import com.BISEN.JANMAT.modelsPackage.User;

public interface userService {
     User createUser (User user);
     User getUserById(Long id);
     List<User> getAllusers();
     User updateUser (Long id, User user);
     void deleteUser (Long id);
    
}
