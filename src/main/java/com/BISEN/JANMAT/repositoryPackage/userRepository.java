package com.BISEN.JANMAT.repositoryPackage;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.BISEN.JANMAT.modelsPackage.User;

@Repository
public interface userRepository extends JpaRepository<User, Long> {

    // custom query example
    // @Query("select u from user u where email="abc@gmail.com")
    // Optional<user> gettinguserByEmail();

}
