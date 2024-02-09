package java8Programs;

public class WithoutUseOFlamda {

    public static void main(String[] args) {

        Dog d=new Dog() {
            @Override
            public void bark() {
                System.out.println("Dog is barking");
            }
        };
        d.bark();
    }
}
