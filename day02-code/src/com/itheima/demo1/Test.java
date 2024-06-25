package com.itheima.demo1;

public class Test {
    public static void main(String[] args) {
//        int number = 1;
//        switch (number){
//            case 1:
//                System.out.println(1);
//            case 2:
//                System.out.println(2);
//            default:
//                System.out.println(3);
//                break;
//            case 1 -> System.out.println(1);
//            case 2 -> System.out.println(2);
//            default -> System.out.println(3);
//        }
        int a = 1;
        int b = 2;
        swap(a, b);
        System.out.println(a);
        System.out.println(b);
    }
    public static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
    }
}
