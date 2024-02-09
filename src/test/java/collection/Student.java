package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Student implements Comparable<Student>{

    String name;
    int age;
    int rollNp;

    Student(String name,int age, int rollNp){
        this.name=name;
        this.age=age;
        this.rollNp=rollNp;
    }

    @Override
    public int compareTo(Student st) {
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        Student s=new Student("ashok",12,23);
        Student s1=new Student("phasok",2,54);
        Student s2=new Student("tasok",13,23);
        al.add(s);
        al.add(s1);
        al.add(s2);
        Collections.sort(al);
        for (Student st:al){
            System.out.println(st.age);
        }
    }
}
