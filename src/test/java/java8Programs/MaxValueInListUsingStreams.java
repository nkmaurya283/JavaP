package java8Programs;

import java.util.List;

public class MaxValueInListUsingStreams {

    public static void main(String[] args) {

        List<Integer> integerList=List.of(1, 4, 7, 2, 9, 3, 8, 5, 6);
        int maximumValue=integerList.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println("Maximum value in list is:"+maximumValue);
    }
}
