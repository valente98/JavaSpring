package com.example.hello;

import java.util.HashMap;

public class readInventoryObject {
    public HashMap<String, readInventoryitem> readinventory(String x){
        if (x.equals("")){
            HashMap empty = new HashMap();
            return empty;
        }
        String[] items = x.split("\n");
        HashMap<String, readInventoryitem> product = new HashMap();
        for(int i = 0; i < items.length; i++){
            String[] arr = items[i].split("\t");
            String name = arr[0];
            double pay = Double.parseDouble(arr[1]);
            double charge = Double.parseDouble(arr[2]);
            readInventoryitem item = new readInventoryitem(name, pay, charge);
            product.put(name, item);
        }
        return product;
    }
}