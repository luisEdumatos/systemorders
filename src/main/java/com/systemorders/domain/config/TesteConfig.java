package com.systemorders.domain.config;

import com.systemorders.domain.entities.User;
import com.systemorders.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("dev")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Teste", "teste@teste", "123456789", "132456");
        User u2 = new User(null, "Teste2", "teste@teste2", "123456789", "132456");
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
