package com.yyl.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2019/12/12.
 */
@RestController
public class ServiceProvidController {
    @PostMapping("greeting")
    public String greeting(@RequestParam Object message){
        return "greeting,"+message;
    }
}
