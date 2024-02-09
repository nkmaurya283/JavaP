package com.program;

import java.util.List;

public class MaxValueInListUsingStreams {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 4, 7, 2, 9, 3, 8, 5, 6);
        int maximumValue = integerList.stream()
                .mapToInt(Integer::intValue) // Convert to IntStream
                .max()
                .orElse(0); // Default value if the list is empty

        System.out.println("Maximum value in the list: " + maximumValue);
    }
}

