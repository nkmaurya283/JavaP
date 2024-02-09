package com.program;

import java.util.*;
import java.util.stream.*;

public class EvenNum {

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,4,5,6);
        HashSet<Integer> set=new HashSet<>();
        list.stream().filter(i->i%2==0).forEach(System.out::println);

        //2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        list.stream().map(i->i+"").filter(i->i.startsWith("1")).forEach(System.out::println);
        //3. How to find duplicate elements in a given integers list in java using Stream functions?
        list.stream().filter(i->!set.add(i)).forEach(System.out::println);
        //4. Given the list of integers, find the first element of the list using Stream functions?
        list.stream().findFirst().ifPresent(System.out::println);
        //5. Given a list of integers, find the total number of elements present in the list using Stream functions?
        System.out.println( list.stream().count());
        //6. Given a list of integers, find the maximum value element present in it using Stream functions?
        System.out.println(list.stream().max(Integer::compare).get());
        //9. Given a list of integers, sort all the values present in it using Stream functions?
        list.stream().sorted().forEach(System.out::println);
        //10. Given a list of integers, sort all the values present in it in descending order using Stream functions?
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }

}
