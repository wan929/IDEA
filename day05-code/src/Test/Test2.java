package Test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("输入一个整数：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x == 1){
            System.out.println("1不是质数");
            return;
        }
        int flag = 1;
        for(int i = 2; i <= Math.sqrt(x); i++){
            if (x % i == 0){
                flag = 0;
                break;
            }
        }
        System.out.println(flag == 0 ? (x+"不是一个质数") : (x+"是一个质数"));
    }
}
