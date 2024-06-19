package com.itheima.arithmeticoperator;

public class Test3 {
    public static void main(String[] args) {
        byte a = 127;
        a += 1; //等同于a = (byte)(a + 1)，强制类型转换
        System.out.println(a);
    }
}
