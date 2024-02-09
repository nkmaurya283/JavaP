package com.program;

import java.util.*;

public class SynchrnisedList {


    public static void main(String[] args) {

        List<String> list= Collections.synchronizedList(new ArrayList<String>());

        list.add("raju");
        list.add("chacha");

        synchronized (list){
            Iterator<String> itr=list.iterator();

            while (itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    }
}
