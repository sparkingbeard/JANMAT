package com.BISEN.JANMAT.repositoryPackage;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.BISEN.JANMAT.modelsPackage.user;

@Repository
public interface userRepository extends JpaRepository<user, Long> {
    
    // custom query example
    // @Query("select u from user u where email="abc@gmail.com")
    // Optional<user> gettinguserByEmail();
    
}
