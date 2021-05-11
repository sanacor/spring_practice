package com.livechat.peter.demo.user;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/user")
public class UserController {


    @GetMapping("{userid}")
    public User getUser() {

    }
}
