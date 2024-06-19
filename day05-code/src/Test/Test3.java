package Test;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //生成随机数1~100
        Random r = new Random();
        int num = (r.nextInt(100)) + 1; //(0~99) + 1
        /*
        System.out.println("随机数是："+num);
        int right = 100;
        int left = 1;
        int mid = (right + left) / 2;
        while(mid != num){
            if(num > mid){
                left = mid;
                mid = (right + left) / 2;
            }else if(num < mid){
                right = mid;
                mid = (right + left) / 2;
            }
        }
        System.out.println("猜到的随机数是："+mid);
        */
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("给出你猜的随机数：");
            int i = sc.nextInt();
            if(i > num){
                System.out.println("提示：大了");
            }else if(i < num){
                System.out.println("提示：小了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
    }
}
