package java8Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateInteger {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,2,5,5,3,8,9);
        Set<Integer> set=new HashSet<>();
        list.stream().filter(n->!set.add(n)).forEach(System.out::println);
    }
}
