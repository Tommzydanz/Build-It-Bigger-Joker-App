package com.udacity.gradle.builditbigger.backend;

import com.example.jokefactoryjavalibrary.Joker;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private Joker mJoker;

    public MyBean() {
        mJoker = new Joker();
    }

    public String getJoke(){
        return  mJoker.getJoke();
    }
}