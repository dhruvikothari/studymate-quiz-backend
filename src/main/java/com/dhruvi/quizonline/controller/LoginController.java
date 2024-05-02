//package com.dhruvi.quizonline.controller;
//
//import com.dhruvi.quizonline.model.User;
//import com.dhruvi.quizonline.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.CrossOrigin;
//
//@RestController
//public class LoginController {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @CrossOrigin("http://localhost:5173") // Replace with your frontend URL
//    @PostMapping("/userlogin")
//    public ResponseEntity<String> login(@RequestBody User loginUser) {
//        User user = userRepository.findByUsername(loginUser.getUsername());
//        if (user != null && user.getPassword().equals(loginUser.getPassword())) {
//            return ResponseEntity.ok("Login successful");
//        } else {
//            return ResponseEntity.badRequest().body("Incorrect username or password");
//        }
//    }
//}
