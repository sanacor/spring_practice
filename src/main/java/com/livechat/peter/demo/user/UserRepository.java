package com.livechat.peter.demo.user;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface UserRepository {
    List<Map<String, Object>> getUser();
}