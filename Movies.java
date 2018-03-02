package com.example.hello;

import java.util.ArrayList;

public class Movies {
    public String title;
    public String director;
    public String genre;
    public ArrayList<String> cast;

    public Movies(){}

    public Movies(String title, String director, String genre, ArrayList<String> cast){
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.cast = cast;
    }

    @Override
    public String toString() {
        ArrayList<String> s = new ArrayList<>();
        s.add("Title: "+ this.title);
        s.add("Director: " + this.director);
        s.add("Genre: " + this.genre);
        s.add("Cast: "+ this.cast);
        return String.join("", s);
    }

    public boolean equals(Movies other){
        if(this.toString().equals(other.toString())){
            return true;
        }
        return false;
    }
}
