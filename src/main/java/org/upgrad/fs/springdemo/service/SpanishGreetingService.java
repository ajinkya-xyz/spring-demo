package org.upgrad.fs.springdemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("Spanish")
public class SpanishGreetingService implements GreetingsService {

    @Override
    public String greet() {
        return "Holas, Welcome to the session!";
    }
}
