package user.controller;

import org.example.cloud.user.entity.User;
import org.example.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Object getUserById(@PathVariable Integer id) {
        return userService.selectById(id);
    }

    @PostMapping("/insert")
    public Object insertUser(@RequestBody User user) {
        userService.insert(user);
        return "success";
    }
}
