package org.upgrad.fs.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.upgrad.fs.springdemo.service.GreetingsService;

@RestController
public class HomeController {

    // Scope - When and how many objects would be created?
    // Singleton - Only one object
    // Prototype - New object whenever asked
    // Request - New object for every new request
    // Session - New object for every session
    // Websocket - New object for each websocket session

    // Traditional
    // We are creating object
//    private GreetingsService greetingsService = new EnglishGreetingService();

    // 1. Attribute level injection
    @Autowired
    @Qualifier("Spanish")
    //@Scope("Singleton")
    // @Primary
    // Use variable name same as class name
    // @Qualifier
    private GreetingsService greetingsService;

    // 2. Constructor based injection - PReferred
    /*public HomeController(GreetingsService greetingsService) {
        this.englishGreetingService = greetingsService;
    }*/

    // 3. Setter level injection
//    public void setEnglishGreetingService(GreetingsService englishGreetingService) {
//        this.englishGreetingService = englishGreetingService;
//    }

    // 1. Spring creates COntroller
    // 2. Spring creates service
    // 3. Uses reflection to inject the bean


    // 1. Spring creates service
    // 2. Creates Controller with service

    @GetMapping("/eng/greet")
    public String greet(){
        return greetingsService.greet();
    }


}
