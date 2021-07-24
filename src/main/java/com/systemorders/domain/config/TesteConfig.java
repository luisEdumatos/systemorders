package com.systemorders.domain.config;

import com.systemorders.domain.entities.Order;
import com.systemorders.domain.entities.User;
import com.systemorders.domain.entities.enums.OrderStatus;
import com.systemorders.domain.repositories.OrderRepository;
import com.systemorders.domain.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("dev")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Teste", "teste@teste", "123456789", "132456", null);
        User u2 = new User(null, "Teste2", "teste@teste2", "123456789", "132456", null);

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.valueOf("PAID"), u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.valueOf("DELIVERED"), u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.valueOf("SHIPPED"), u1);
        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
