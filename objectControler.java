package com.example.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class objectControler {

    @GetMapping("/readInventory")
    public Object readInventory(@RequestParam String x){
        readInventoryObject products = new readInventoryObject();
        return products.readinventory(x);

    }

    @GetMapping("/isDollarStore")
    public Boolean isDollarStore(@RequestParam Array x){
        isDollarStoreObject items = new isDollarStoreObject();
        return items.isDollarStore(x);
    }

}
