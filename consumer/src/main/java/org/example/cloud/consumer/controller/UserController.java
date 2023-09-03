package org.example.cloud.consumer.controller;

import org.example.cloud.consumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    public static final String SERVICE_URL = "http://USER-SERVICE";

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/consumer/user/{id}")
    public User getUser(@PathVariable Integer id) {
        return restTemplate.getForObject(SERVICE_URL + "/user/" + id, User.class);
    }
}
