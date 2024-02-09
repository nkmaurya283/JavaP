package com.program;

import java.util.Arrays;

public class MaxInArray {

    public static void main(String[] args) {
        int[] x={2,3,2,4,6,7};

        System.out.println( Arrays.stream(x).max().getAsInt());
    }
}
