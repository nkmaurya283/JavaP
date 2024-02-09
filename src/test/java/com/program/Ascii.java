package com.program;

public class Ascii {

    public static void main(String[] args) {

        String a="My name is abc";

        String y=a.replaceAll("\\s","");

        for(int i=0;i<y.length();i++){
            int z=y.charAt(i);
            System.out.println(z);
        }
    }
}
