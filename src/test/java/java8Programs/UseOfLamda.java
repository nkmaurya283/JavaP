package java8Programs;

public class UseOfLamda {

    public static void main(String[] args) {

        Dog dog=()->{
            System.out.println("dog is barking");
        };
        dog.bark();
    }
}
