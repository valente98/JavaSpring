package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

@RestController
public class ArrayandLoopsControler {
    @GetMapping("/lastThree")
    public ArrayList<String> lastThree(@RequestParam String x) {
        String[] words= x.split("\\s");
        String[] lastthree;
        lastthree = Arrays.copyOfRange(words,words.length - 3, words.length);
        ArrayList<String> list = new ArrayList<>();
        for (String w: lastthree){
            list.add(w);
        }
        return list;
    }

    @GetMapping("/sum")
    public double sum(@RequestParam String x){
        String[] words = x.split("\\s");
        return words.length;
    }

    @GetMapping("/sumofLonger")
    public double sum(@RequestParam String x,
                      @RequestParam String y){
        String[] list1 = x.split("\\s");
        String[] list2 = y.split("\\s");
        if (list1.length > list2.length){
            Double total = 0.0;
            for(String w : list1){
                total += Double.parseDouble(w);
            }
            return total;
        }else if (list1.length < list2.length) {
            Double total = 0.0;
            for (String w : list2) {
                total += Double.parseDouble(w);
            }
            return total;
        }else {
            Double total = 0.0;
            for (String w : list1){
                total += Double.parseDouble(w);
            }
            for (String w: list2){
                total += Double.parseDouble(w);
            }
            return total;

        }
    }

    @GetMapping("/differenceFromMinimum")
    public ArrayList<Double> differenceFromMinimum (@RequestParam String x){
        String[] list = x.split("\\s");

        ArrayList<Double> num_list = new ArrayList<>();

        for (String num: list){
            num_list.add(Double.parseDouble(num));
        }

        double lowest = Collections.min(num_list);

        ArrayList<Double> new_list = new ArrayList<>();

        for(double num : num_list){
            new_list.add(num - lowest);
        }
        return new_list;

    }

    @GetMapping("/hashtags")
    public ArrayList<String> hashtags (@RequestParam String x){
        String[] tags = x.split("\\s");
        ArrayList<String> with_tags = new ArrayList<>();
        for (String w: tags){
            if (w.startsWith("#")){
                with_tags.add(w);
            }
        }
        return with_tags;
    }

    @GetMapping("/mentions")
    public ArrayList<String> mentions (@RequestParam String x){
        String[] tags = x.split("\\s");
        ArrayList<String> with_tags = new ArrayList<>();
        for (String w: tags){
            if (w.startsWith("@")){
                with_tags.add(w);
            }
        }
        return with_tags;
    }

    @GetMapping("/parseInventory")
    public ArrayList parseInventory(@RequestParam String x){
        String[] inventory = x.split("\t");
        ArrayList product = new ArrayList();
        product.add(inventory[0]);
        product.add(Double.parseDouble(inventory[1]));
        product.add(Double.parseDouble(inventory[2]));
        return product;
    }


}
