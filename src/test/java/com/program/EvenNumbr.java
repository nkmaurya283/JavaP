package com.program;

import java.util.Arrays;
import java.util.List;

public class EvenNumbr {

    public static void main(String[] args) {

        List<Integer>  list= Arrays.asList(10,20,7,49,25,100,32);
        list.stream().filter(i->i%2==0).forEach(System.out::println);
    }
}
