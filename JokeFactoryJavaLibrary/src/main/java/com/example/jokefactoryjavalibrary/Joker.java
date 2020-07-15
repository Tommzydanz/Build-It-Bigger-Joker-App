package com.example.jokefactoryjavalibrary;

import java.util.ArrayList;
import java.util.Random;

public class Joker {


    public Random randomJokes;
    public ArrayList<String> jokes;

    public void tellJoke(){
        jokes = new ArrayList<>();
        randomJokes = new Random();

        jokes.add("joke1");
        jokes.add("joke1");
        jokes.add("joke1");
        jokes.add("joke1");
    }

    public  String getJoke(){
        int position = randomJokes.nextInt(jokes.size());
        return jokes.get(position);
    }
}