package com.develop;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class UtilApp {

    public static void main(String[] args) {
//        Integer n = Integer.parseInt("4");
//        
//        System.out.println(n.intValue());
//        Integer n = null;
//        System.out.println(n);
//        
//        int x = n;
        BigDecimal b = new BigDecimal("3.4252525");
        
        b = b.add(new BigDecimal("4.19482"));
        
        DecimalFormat df = new DecimalFormat("$###,###.##");
        
        System.out.println(df.format(458.939));
        
        System.out.println(b);
        
    }

}
