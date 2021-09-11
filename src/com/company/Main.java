package com.company;
import java.util.*;
public class Main {


    public static void main(String[] args) {
        System.out.println(increase(new int[] {10,100,1000,404,252}));
    }
    static int increase(int[] a) {
        for (int i=0; i<a.length; i++){
            System.out.print(i+" - ");
            System.out.println(a[i]);
        }
        System.out.println("\nУвеличение массива на 10% \n");
        for (int b=0; b<a.length;b++){
            a[b]=(int) (a[b]+a[b]*0.10);
            System.out.print(b+" - ");
            System.out.println(a[b]);}
        return 0 ;
    }

}