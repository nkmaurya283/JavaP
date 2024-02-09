package collection;

public class InvalidAgeException extends Exception{

    InvalidAgeException(String str){
        super(str);
    }
}

class Student1 {

    public void  calculateAge(int age) throws InvalidAgeException {

        if (age<18){
            throw  new InvalidAgeException("Age is less then 18");
        }
    }

    public static void main(String[] args) {

        Student1 student1=new Student1();
        try {
            student1.calculateAge(17);
        }catch (InvalidAgeException ex){
            System.out.println(ex.fillInStackTrace());
        }
    }

}
