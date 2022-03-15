package com.example.training.jpazin.config;

import com.example.training.jpazin.entities.User;
import com.example.training.jpazin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User(null,"Aluiene","luien@gmail.com","31987404440","D144as");
        User user1 = new User(null,"Pipo","pippow@gmail.com","31978874424","Dasad44");

        userRepository.saveAll(Arrays.asList(user1,user));
    }
}
