package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        //计算有小数参与，结果可能不精确，具体原因与小数的存储格式相关
        System.out.println(1.1 + 1.1); //2.2
        System.out.println(1.1 - 1.01); //0.09000000000000008
        System.out.println(1.1 + 1.01); //2.1100000000000003
        System.out.println(1.1 * 1.01); //2.1100000000000003

        int a = 10;
        double b = a;
        System.out.println(b); //10.0 隐式转换（取值范围小的自动转为大的）

        byte c = 10;
        byte d = 127; //byte: -128 ~ 127
        byte result = (byte)(c + d);
        System.out.println(result);
    }
}
