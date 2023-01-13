package com.example.demo.dao;

import com.example.demo.Entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User selectUser(int id);
}
