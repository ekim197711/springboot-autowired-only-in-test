package com.example.demo;

import org.junit.jupiter.api.Test;

public class EntertainerTest {

    @Test
    public void tellDadjoke() {
        Entertainer entertainer = new Entertainer(new Dad());
        System.out.println(entertainer.telljoke());
    }

    @Test
    public void tellUnclejokes() {
        Entertainer entertainer = new Entertainer(new Uncle());
        System.out.println(entertainer.telljoke());
    }
}