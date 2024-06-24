package day07;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入加密数字：");
        int encryptNumber = sc.nextInt(); //8346
        int tempEncryptNumber = encryptNumber;
        int len = 0;
        while(encryptNumber > 0){
            len++;
            encryptNumber /= 10;
        }
        int[] arr = new int[len];
        int arrIndex = 0;
        while(tempEncryptNumber > 0){
            int ge = tempEncryptNumber % 10;
            arr[arrIndex++] = ge;
            tempEncryptNumber /= 10;
        }
        //6 4 3 8
        int[] arr2 = new int[len];
        //int arr2Index = 0;
        for(int i = 0; i < len; i++){
            if(arr[i] >= 5){
                arr2[i] = arr[i] - 5;
            }else{
                arr2[i] = arr[i] + 5;
            }
        }
        String result = "";
        for(int i = 0; i < len; i++){
            result += arr2[i];
        }
        System.out.println("原始数字为："+result);
    }
}
