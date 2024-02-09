package oops;

public class Animal {

    void makeSound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog barks");
    }
}

class Driver{
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.makeSound();
    }
}
