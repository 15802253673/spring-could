package com.yyl.controller;

import com.yyl.object.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: 
 * @ClassName: ClientController
 * @Author: yyl
 * @Date: 2020/1/6 16:17
 */
@RestController
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${serivce-provider.host}")
    private String serviceProviderHost;

    @Value("${serivce-provider.port}")
    private Integer serviceProviderPort;

    @Value("${serivce-provider.name}")
    private String serviceProviderName;


    @GetMapping("")
    public String index() {
        User user = new User();
        user.setId(1L);
        user.setName("小马哥");
//        return restTemplate.postForObject("http://" +
//                        serviceProviderHost + ":" + serviceProviderPort +
//                        "/greeting",
//                user, String.class);

        return restTemplate.postForObject("http://" +
                        serviceProviderName +
                        "/greeting",
                user, String.class);
    }

}
