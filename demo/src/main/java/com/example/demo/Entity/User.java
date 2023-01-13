package com.example.demo.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private Integer id;
    private String username;
    private String userpassword;
    private String phone;
    private String company;

    @Override
    public String toString(){
        return "id: " + id + "; username: " + username;
    }
}
