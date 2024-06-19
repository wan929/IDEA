package Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1; i < x; i++) {
            if(i * i >= x){
                System.out.println("平方根为："+(i * i > x ? (i-1) : i));
                break;
            }
        }
    }
}
