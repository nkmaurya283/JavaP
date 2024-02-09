package java8Programs;

public class Adding2Num {

    public static void main(String[] args) {

        Addition addition=(a,b)-> (a+b);

        System.out.println(addition.add(1,1));
    }
}
