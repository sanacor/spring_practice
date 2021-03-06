package com.livechat.peter.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public List<Map<String, Object>> getUser() {
        return userRepository.getUser();
    }
}
