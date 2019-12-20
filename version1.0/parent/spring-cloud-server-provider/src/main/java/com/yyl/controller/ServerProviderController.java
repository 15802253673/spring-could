package com.yyl.controller;

import com.yyl.object.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 2019/12/16.
 */
@RestController
public class ServerProviderController {

    @Value("${server.port}")
    private String port;

    @PostMapping("greeting")
    public String greeting(@RequestBody User user){
        return "Greeting , " + user + " on port : " + port;
    }
}
