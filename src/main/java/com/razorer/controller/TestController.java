package com.razorer.controller;

import com.razorer.model.UserModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Daniel on 16/10/2016.
 */
@RestController
@RequestMapping("/api/")
public class TestController {

    @RequestMapping(value = "/test/user", method = RequestMethod.GET)
    public UserModel getUserInfoById(int id) {
        return new UserModel(id, "张三", 35);
    }
}
