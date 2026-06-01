package com.peeradonthien.crudapi.controllers;

import com.peeradonthien.crudapi.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
//Define main path จะได้ไม่ต้อง /api/... ทุกอัน
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> data = new ArrayList<User>();
        data.add(new User("peeradon","thien"));
        data.add(new User("a","b"));
        return data;
        //api will return json by use jackson to convert java class to json
    }
}
