package org.example.cloud.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.cloud.user.entity.User;
import org.example.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Value("${server.port}")
    private String port;

    @GetMapping("/{id}")
    public Object getUserById(@PathVariable Integer id) {
        log.info("port: {} getUserById", port);
        return userService.selectById(id);
    }

    @PostMapping("/insert")
    public Object insertUser(@RequestBody User user) {
        userService.insert(user);
        return "success";
    }
}
