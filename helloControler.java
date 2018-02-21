package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloControler {
    @GetMapping("/")
    public String hello(){
        return "hello World ;)";
    }

    @GetMapping("/goodbye")
    public String goodbye(){
        return "GOODBYE CRUEL WORLD ;(";
    }

    @GetMapping("/goodbye/{name}")
    public String goodbye(@PathVariable String name){
        return "GOODBYE "+ name;
    }

    @GetMapping("/add")
    public Double add(@RequestParam double x, @RequestParam double y){
        return x + y;
    }

    @GetMapping("/double")
    public Double twice(@RequestParam double x){
        return x * 2;
    }

    @GetMapping("/multiplythree")
    public Double multiplythree(@RequestParam double x, @RequestParam double y, @RequestParam double z){
        return x * y * z;
    }

    @GetMapping("/earnings")
    public double earnings(@RequestParam double x,
                           @RequestParam double y,
                           @RequestParam double z){
        return x * 15 + y * 12 + z * 9;
    }

    @GetMapping("/bothtrue")
    public Boolean bothtrue(@RequestParam boolean x,
                            @RequestParam boolean y){
        return x && y;
    }

    @GetMapping("/walkordrive")
    public String earnings(@RequestParam double x,
                           @RequestParam boolean y){
        if (x <= 0.25 && y){
            return "You should walk!";
        }else {
            return "You should drive.";
        }
    }

    @GetMapping("/howpopulated")
    public String howpopulated(@RequestParam double x,
                               @RequestParam double y){
        if (x/y > 100){
            return "Densely Populated";
        }else{
            return "Sparsely Populated";
        }
    }

    @GetMapping("/goldstar")
    public String goldstar(@RequestParam double x){
        if (x < 1000){
            return "*";
        }else if (x < 5000){
            return "**";
        }else if (x < 8000){
            return "***";
        }else if (x < 10000){
            return "****";
        }else{
            return "*****";
        }
    }

    @GetMapping("/howManyPoints")
    public String howManyPoints(@RequestParam String x) {
        if (x.equals("td")){
            return "6";
        }else if (x.equals("fg")){
            return "3";
        }else if (x.equals("sa")){
            return "2";
        }else if (x.equals("ec")){
            return "2";
        }else if (x.equals("ek")){
            return "1";
        }else{
            return null;
        }
    }


}
