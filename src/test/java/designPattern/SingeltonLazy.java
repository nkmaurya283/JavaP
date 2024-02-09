package designPattern;

public class SingeltonLazy {

    private static SingeltonLazy singeltonLazy;

    private SingeltonLazy(){}

    public static SingeltonLazy getInstance(){

        if(singeltonLazy==null){

            synchronized (SingeltonLazy.class){
                if(singeltonLazy==null){
                    singeltonLazy=new SingeltonLazy();
                }
            }
        }
        return singeltonLazy;
    }
}
