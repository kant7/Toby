package com.hoon;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
    public String sayHello() {
        return "Hello world! 남궁훈입니다.";
    }
}
