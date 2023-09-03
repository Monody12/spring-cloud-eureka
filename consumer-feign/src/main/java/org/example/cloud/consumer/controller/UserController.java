package org.example.cloud.consumer.controller;

import org.example.cloud.consumer.client.UserFeignClient;
import org.example.cloud.consumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping(value = "/consumer/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id) {
        User user = userFeignClient.getUserById(id);
        return ResponseEntity.ok(user);
    }
}
