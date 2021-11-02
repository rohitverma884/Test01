package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String abc[]){

        List<String> list = new ArrayList<String>();

        list.add("Rohit");
        list.add("Arun");
        list.add("Rohit1");
        list.add("Arun1");
        list.add("Rohit2");
        list.add("Arun2");
        list.add("Arun2");
        list.add("Arun2");
        list.add("Arun2");

       boolean isExist = list.contains("Arun2");
       if(isExist){
          int index = list.indexOf("Arun2");
          String value = list.get(index);
       }

        Map<Integer,String> map = new HashMap();

        map.put(123, "John");
        map.put(125, "kalis");
        map.put(126, "John");
        map.put(128, "kalis");
        map.put(120, "John");
        map.put(117, "Xyz");
        map.put(119, "xyz1");

       System.out.println(map.get(117));




    }
}
