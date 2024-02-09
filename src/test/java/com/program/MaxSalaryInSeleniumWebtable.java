package com.program;

import java.text.NumberFormat;
import java.text.ParseException;

public class MaxSalaryInSeleniumWebtable {

    public static void main(String[] args) throws ParseException {
        String max=null;
        Double m=0.0,r=0.0;

        NumberFormat f=NumberFormat.getInstance();
        Number num=f.parse(max);
               max=num.toString();
               m=Double.parseDouble(max);
               if(m>r){
                   r=m;
               }
    }
}
