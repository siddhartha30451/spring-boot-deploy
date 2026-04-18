package com.myProject.spring.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/welcome")
    public String welcome(){
        return "Hello User! welcome to my App. you are now in feature-test branch";
    }
}
