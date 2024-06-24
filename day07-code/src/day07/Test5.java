package day07;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("输入原始数字：");
        int originNumber = sc.nextInt(); //1983
        int tempNumber = originNumber;
        int len = 0;
        while(originNumber > 0){
            originNumber /= 10;
            len++;
        }
        int[] arr = new int[len];
        int arrIndex = 0;
        while(tempNumber > 0){
            int tmp = tempNumber % 10;
            arr[arrIndex++] = (tmp + 5) % 10;
            tempNumber /= 10;
        }
        int encryptNumber = 0;
        String encryptStringNumber = "";
        for(int i = 0; i < arr.length; i++){
            // encryptNumber += arr[i] * Math.pow(10, (arr.length - i - 1));
            encryptNumber = (encryptNumber * 10) + arr[i]; //不好解决有0的情况比如arr = 0，1，2
            //字符串拼接
            encryptStringNumber += arr[i];
        }
        System.out.println("加密数字为："+encryptStringNumber);
    }
}