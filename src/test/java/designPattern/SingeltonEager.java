package designPattern;

public class SingeltonEager {

    private static SingeltonEager singeltonEager=new SingeltonEager();

    private SingeltonEager(){

    }
    public static SingeltonEager getSingeltonEager(){
        return singeltonEager;
    }
}
