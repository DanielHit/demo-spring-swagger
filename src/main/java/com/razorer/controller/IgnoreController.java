package com.razorer.controller;

import com.razorer.annotation.SwaggerIgnore;
import com.razorer.model.UserModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Daniel on 16/10/2016.
 * user @SwaggerIgnore, this controller will not be in swagger ui
 */
@RestController
@SwaggerIgnore
@RequestMapping("/api/")
public class IgnoreController {

    @RequestMapping("/ignroe/controller")
    public UserModel ignoreUserModel() {
        return new UserModel("fuck", 23);
    }

}
