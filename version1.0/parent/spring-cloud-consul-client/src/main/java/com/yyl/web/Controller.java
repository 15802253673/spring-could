package com.yyl.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2019/12/7.
 */
@RestController
public class Controller {
    @Autowired
    private DiscoveryClient discoveryClient;

    private final String currentApplicationName;

    @Autowired
    public Controller(@Value("${spring.application.name}") String currentApplicationName) {
        this.currentApplicationName = currentApplicationName;
    }

    /**
     * 获取当前应用信息
     *
     * @return
     */
    @RequestMapping("getCurrentServiceInstance")
    public ServiceInstance getCurrentServiceInstance() {
        List<ServiceInstance> serviceInstance = getServiceInstance();
        serviceInstance.forEach(serverName -> {
            System.out.println(serverName);
        });
        return null;
    }

    /**
     * 获取服务器名称
     *
     * @return
     */
    @RequestMapping("getListServer")
    public List<String> getListServer() {
        return discoveryClient.getServices();
    }

    /**
     * 获取所有的服务实力信息
     *
     * @return
     */
    @RequestMapping("getServiceInstance")
    public List<ServiceInstance> getServiceInstance() {
        List<String> listServer = getListServer();
        List<ServiceInstance> serviceInstance = new LinkedList<>();
        listServer.forEach(serverName -> {
            serviceInstance.addAll(discoveryClient.getInstances(serverName));
        });
        return serviceInstance;
    }

    @RequestMapping("/check")
    public String check() {
        System.out.println("ok");
        return "ok";
    }
}
