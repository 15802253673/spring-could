package com.yyl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2019/11/27.
 */
@RestController
public class StatusController {

    @GetMapping("status")
    public String getStatus(){
        System.out.println("ok");
        return "ok";
    }
}
