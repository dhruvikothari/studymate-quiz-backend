//package com.dhruvi.quizonline.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.validation.constraints.NotBlank;
//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
//@Entity
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @NotBlank
//    private String username;
//
//    @NotBlank
//    private String password;
//
//    public User() {
//    }
//
//    public User(String username, String password) {
//        this.username = username;
//        this.password = password;
//    }
//
//    // Getters and setters
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}
