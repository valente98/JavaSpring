package com.example.hello;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Movies {
    public String title;
    public String director;
    public String genre;
    public ArrayList<String> cast;
    public ArrayList movie;

    public Movies(String title, String director, String genre, ArrayList<String> cast){
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.cast = cast;
        ArrayList<String> String = new ArrayList<>();
        String.add("Title: "+ this.title);
        String.add("Director: " + this.director);
        String.add("Genre: " + this.genre);
        String.add("Cast: "+ this.cast);
        this.movie = String;
    }
    public boolean equals(Movies other){
        if(this.movie.equals(other.movie)){
            return true;
        }
        return false;
    }
}
