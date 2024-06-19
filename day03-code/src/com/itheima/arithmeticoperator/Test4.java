package com.itheima.arithmeticoperator;

public class Test4 {
    public static void main(String[] args) {
        int a = 190;
        int b = 130;
        int c = 165;
        int result = a > b ? (a > c ? a : c) : (b > c ? b : c);
        //System.out.println(result);

        int d = -2;
        String binary = Integer.toBinaryString(d);
        String binary2 = Integer.toBinaryString(d >>> 2);
        String binary3 = Integer.toBinaryString(d >> 2);
        System.out.println(d);
        System.out.println(binary);
        System.out.println(d >>> 2);
        System.out.println("00" + binary2);
        System.out.println(d >> 2);
        System.out.println(binary3);
    }
}
