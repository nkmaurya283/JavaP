package java8Programs;

public class MyClass {

    private String name;

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
        myClass.setName("Navneet");
        myClass.getName();
        System.out.println(myClass.getName());
    }
}