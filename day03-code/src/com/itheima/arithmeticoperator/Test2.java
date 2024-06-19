package com.itheima.arithmeticoperator;

public class Test2 {
    public static void main(String[] args) {
        char c = 'a';
        int result = c + 1; //char类型的c会转为int先 'a' = 97
        System.out.println(result);
        System.out.println(c + "abc"); //"aabc"
    }
}
