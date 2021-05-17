package com.livechat.peter.demo.user;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("api/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(path = "user")
    public List<Map<String, Object>> getUser() {
            return userService.getUser();
    }
}
