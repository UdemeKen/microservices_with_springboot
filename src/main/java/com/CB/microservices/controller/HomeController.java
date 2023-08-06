package com.CB.microservices.controller;

import com.CB.microservices.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Hello World!!!";
    }

    @GetMapping("/user")
    public User user(){
        User user = new User();
        user.setId(1);
        user.setName("Kendrick");
        user.setEmailId("udemekendrick@gmail.com");

        return user;
    }

    @GetMapping("/{id}/{id2}")
    public String pathVariable(@PathVariable String id,
                               @PathVariable("id2") String name){
        return "The path variable is : " + id + " : " + name;
    }

    @GetMapping("/requestparam")
    public String requestParam(@RequestParam String name,
                               @RequestParam(name = "email", required = false, defaultValue = "") String emailId){
        return "My name is : " + name + ", and my email ID is : " + emailId;
    }
}
