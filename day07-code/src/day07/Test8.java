package day07;

import java.util.Random;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        //随机生成中奖号码6+1 红：1-33(不能重复) 蓝：1-16
        Random r = new Random();
        int[] prizeNumberArray = new int[7];
        for(int i = 0; i < 7;){
            if(i < 6){
                int redNumber = r.nextInt(33) + 1;
                if(isContains(prizeNumberArray, redNumber, prizeNumberArray.length)){
                    continue;
                }else{
                    prizeNumberArray[i] = redNumber;
                    i++;
                }
            }else{
                int blueNumber = r.nextInt(16) + 1;
                prizeNumberArray[i] = blueNumber;
                i++;
            }
        }
        //打印
        for(int i = 0; i < prizeNumberArray.length; i++){
            System.out.print(prizeNumberArray[i]+" ");
        }
        System.out.println();
        //用户的号码
        Scanner sc = new Scanner(System.in);
        int[] myNumberArray = new int[7];
        for(int i = 0; i < 7;){
            if(i < 6) {
                System.out.println("请输入第"+(i+1)+"个红色号码");
                int myRedNumber = sc.nextInt();
                if(myRedNumber < 1 || myRedNumber > 33){
                    System.out.println("红色号码不在范围内，请重新输入");
                    continue;
                }else{
                    if(isContains(myNumberArray, myRedNumber, myNumberArray.length)){
                        System.out.println("该号码已存在，请重新输入");
                        continue;
                    }else{
                        myNumberArray[i] = myRedNumber;
                        i++;
                    }
                }
            }else{
                System.out.println("请输入第"+(i+1)+"个蓝色号码");
                int myBlueNumber = sc.nextInt();
                if(myBlueNumber < 1 || myBlueNumber > 16) {
                    System.out.println("蓝色号码不在范围内，请重新输入");
                    continue;
                }else{
                    myNumberArray[i] = myBlueNumber;
                    i++;
                }
            }
        }
        //打印
        for(int i = 0; i < myNumberArray.length; i++){
            System.out.print(myNumberArray[i]+" ");
        }
        //判断是否中奖
        int redCount = 0;
        int blueCount = 0;
        for(int i = 0; i < myNumberArray.length - 1; i++) {
            if (isContains(prizeNumberArray, myNumberArray[i], prizeNumberArray.length - 1)) {
                redCount++;
            }
        }
        if(myNumberArray[myNumberArray.length - 1] == prizeNumberArray[prizeNumberArray.length - 1]){
            blueCount++;
        }
        System.out.println();
        System.out.println("中奖情况是："+redCount+" "+blueCount);
    }

    public static boolean isContains(int[] arr, int number, int len){
        for(int i = 0; i < len; i++){
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }
}