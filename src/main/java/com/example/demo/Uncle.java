package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service("unclejokes")
public class Uncle implements JokeProvider {
    @Override
    public List<String> gimmeJokes() {
        return List.of(
                "What is white when it goes up and yellow when it comes down? An egg",
                "Mom: How do I look? DAD: With your eyes",
                "Spring is here! I got so excited I wet my plants"
        );
    }
}
