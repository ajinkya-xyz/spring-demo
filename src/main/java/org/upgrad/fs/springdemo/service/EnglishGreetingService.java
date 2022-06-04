package org.upgrad.fs.springdemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("English")
public class EnglishGreetingService implements GreetingsService {

    @Override
    public String greet() {
        return "Hello, Welcome to the session!";
    }
}
