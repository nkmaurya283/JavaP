package com.program;

import java.util.Arrays;
import java.util.List;

public class LengthCount {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("Rakesh","Mukesh","abc","abcdefg");
        long count=list.stream().filter(i->i.length()>3).count();
        System.out.println(count);
    }
}
