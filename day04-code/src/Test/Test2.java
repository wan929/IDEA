package Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个被除数：");
        int a = sc.nextInt();
        System.out.println("输入一个除数：");
        int b = sc.nextInt();
        int count = 0;
        int remain = 0;
        int tmp = b;
        while(tmp <= a) {
            count ++;
            tmp += b;
        }
        remain = a - (tmp - b);
        System.out.println("商是："+ count + "，余数是：" + remain);
    }
}
