package org.example.cloud.consumer.client;

import org.example.cloud.consumer.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "USER-SERVICE")
public interface UserFeignClient {
    @GetMapping(value = "/user/{id}")
    User getUserById(@PathVariable("id") Integer id);
}
