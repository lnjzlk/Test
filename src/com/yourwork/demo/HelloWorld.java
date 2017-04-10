package com.yourwork.demo;

/**
 * Created by liukun on 16/9/4.
 */
public class HelloWorld {
    public static void main(String[] args){
        //System.out.println(exR1(6));
        System.out.println("mystery(2,25) = " + mystery(2 , 25));
        System.out.println("mystery(3,11) = " + mystery(3 , 11));
    }
    public static String exR1(int n) {
        if (n<=0) return "";

        return exR1(n-3) + n + exR1(n-2) + n;
    }
    public static int mystery(int a,int b){
        if(b==0) return 0;
        if (b%2 == 0) return mystery(a+a,b/2);
        return mystery(a + a,b/2) + a;
    }
}
