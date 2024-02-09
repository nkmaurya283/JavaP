package java8Programs;

import java.util.ArrayList;
import java.util.List;

public class PrintArrayListUsingLambdaExpression {

    public static void main(String[] args) {
        List<String>  list=new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("JavaScript");
        list.add("C#");

        list.forEach((x)->{

            System.out.println(x);
        });
     }
}
