package com.yyl.util;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by admin on 2019/12/10.
 */
@ConfigurationProperties
public class personal {
    public String name;

    public String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
