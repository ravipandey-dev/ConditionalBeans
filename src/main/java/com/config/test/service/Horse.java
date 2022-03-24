package com.config.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(prefix = "animal", name = "type")
public class Horse extends Animal{

    @Autowired
    AnimalHelper helper;

    @Override
    public void eat() {
        System.out.println("Horse Eating");
        helper.help();
    }
}
