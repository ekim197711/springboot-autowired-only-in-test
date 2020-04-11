package com.example.demo;

import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.List;

@Service("dadjokes")
public class Dad implements JokeProvider {
    @Override
    public List<String> gimmeJokes() {
        return List.of(
                "How do you create holy water? - You boil the hell out of it!",
                "Im reading a book about anti-gravity... Its impossible to put down!",
                "What do you call someone with no body and no nose? Nobody knows."
        );
    }
}
