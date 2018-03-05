package com.example.hello;

import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class objectControler {

    @GetMapping("/readInventory")
    public HashMap<String, Item> readInventory(@RequestParam String x) {
        if (x.equals("")) {
            return new HashMap();
        }
        ArrayList<String> items = new ArrayList<>(Arrays.asList(x.split("\n")));
        HashMap<String, Item> product = new HashMap();
        for (int i = 0; i < items.size(); i++) {
            String[] arr = items.get(i).split("\t");
            String name = arr[0];
            double pay = Double.parseDouble(arr[1]);
            double charge = Double.parseDouble(arr[2]);
            Item item = new Item(name, pay, charge);
            product.put(name, item);
        }
        return product;
    }

    @PostMapping("/isDollarStore")
    public boolean isDollarStore(@RequestBody HashMap<String, Item> x) {
        for (Item i : x.values()) {
            if (i.charging > 1) {
                return false;
            }
        }
        return true;
    }

    @PostMapping("/movie")
    public boolean movie(@RequestBody MovieDTO m) {
        return m.m1.equals(m.m2);
    }

}
