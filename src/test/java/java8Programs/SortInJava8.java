package java8Programs;

import java.util.Arrays;
import java.util.List;

public class SortInJava8 {

    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(2,3,5,3,4,7,4,9,0);
        integerList.stream().sorted().forEach(System.out::println);
    }
}
