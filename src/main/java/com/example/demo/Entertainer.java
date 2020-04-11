package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class Entertainer {
    private final JokeProvider jokeProvider;

    public Entertainer(@Qualifier("dadjokes") JokeProvider jokeProvider) {
        this.jokeProvider = jokeProvider;
    }

    public String telljoke(){
        int index = new Random().nextInt()%jokeProvider.gimmeJokes().size();
        return jokeProvider.gimmeJokes().get(Math.abs(index));
    }
}
