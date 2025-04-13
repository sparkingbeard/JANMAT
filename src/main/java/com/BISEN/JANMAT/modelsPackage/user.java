package com.BISEN.JANMAT.modelsPackage;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Data
@Getter
@Setter
@Table(name="users")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long userId;
    @Column(nullable=false)
    private String userName;
    @Column(nullable = false)
    private String email;
    @Column(nullable=false, unique=true)
    private String password;
    @Column(name="role",nullable = false)
    @Enumerated
    private ENUMuserTypes role;
    @Column(nullable = false)
    private String createdAt;

// public Long getUserID() {
//      return user_id;
// }
// public void setUserId( Long user_id){
//     this.user_id= user_id; 
// }

// public String getUserName() {
//     return user_name;
// }
// public void setUserName( String user_name){
//     this.user_name = user_name;
// }





}
