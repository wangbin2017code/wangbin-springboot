package com.wangbin.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author wangbin
 * @date 2018/6/13 22:14
 */
@Component
@ConfigurationProperties(prefix = "student")
public class Student {

    private Integer age;
    private String name;
    private Double socre;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSocre() {
        return socre;
    }

    public void setSocre(Double socre) {
        this.socre = socre;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", socre=" + socre +
                '}';
    }
}
