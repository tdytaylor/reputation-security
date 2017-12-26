package com.taylor.web.controller;

import com.taylor.dto.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  taylor
 */
@RestController
public class UserController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public List<User> query() {
        List<User> lists = new ArrayList<>();
        lists.add(new User("taylor", "123456"));
        lists.add(new User("taylor", "123456"));
        lists.add(new User("taylor", "123456"));
        return lists;
    }
}
