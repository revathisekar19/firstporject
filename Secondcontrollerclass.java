package com.example.secondproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test1/")
public class Secondcontrollerclass {
    @GetMapping("/hello/{name}")
    public String insert(@PathVariable("name") String name)
    {
        return "Hello" + name;
    }
}
