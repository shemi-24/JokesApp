package com.js.joke.model;

public class Joke {

    private String jokeText;
    private boolean isLiked;

    public Joke(String jokeText,boolean isLiked){
        this.jokeText=jokeText;
        this.isLiked=isLiked;
    }

    public String getJokeText() {
        return jokeText;
    }

    public void setJokeText(String jokeText) {
        this.jokeText = jokeText;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }
}
