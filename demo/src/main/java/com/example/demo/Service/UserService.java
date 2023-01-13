package com.example.demo.Service;

import com.example.demo.Entity.User;
import com.example.demo.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper mapper;

    public User queryUserById(int id){
        return mapper.selectUser(id);
    }
}
