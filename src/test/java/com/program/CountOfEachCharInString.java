package com.program;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfEachCharInString {

    public static void main(String[] args) {
        String s="Navneet";

        Map<String,Long> map= Arrays.stream(s.split("")).
                map(String::toLowerCase).collect(Collectors.groupingBy(str->str, LinkedHashMap::new,Collectors.counting()));
        System.out.println(map);
    }
}
