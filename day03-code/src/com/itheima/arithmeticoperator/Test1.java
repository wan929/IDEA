package com.itheima.arithmeticoperator;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入一个三位整数："); //自动换行
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int ge = i % 10;
        int shi = (i / 10) % 10;
        int bai = i / 100;
        System.out.println("个位数是：" + ge);
        System.out.println("十位数是：" + shi);
        System.out.println("百位数是：" + bai);
    }
}
