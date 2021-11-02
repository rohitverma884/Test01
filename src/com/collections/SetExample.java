package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

    public static void main(String[] abc){

        List<String> list = new ArrayList();

        list.add("A");
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("C");
        list.add("C");
        //[A, B, A]
        // 0  1   2  index

        System.out.println(list);

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("A");
        set.add("B");
        set.add("B");
        set.add("C");
        set.add("C");
        System.out.println(set);



    }
}
