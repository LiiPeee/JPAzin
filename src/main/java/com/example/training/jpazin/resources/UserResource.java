package com.example.training.jpazin.resources;


import com.example.training.jpazin.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    private ResponseEntity<User>findAll(){
        User user = new User(1,"Felipe","lipee@gmail.com","31988414880","Ld#@32244");
        return ResponseEntity.ok().body(user);
    }

}
