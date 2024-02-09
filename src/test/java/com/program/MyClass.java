package com.program;

public class MyClass {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Main{
    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        myClass.setName("Navneet ");
        String name=myClass.getName();
        System.out.println("Name is:"+name);

        myClass.setAge(50);
        int age=myClass.getAge();
        System.out.println(age);
    }
}
