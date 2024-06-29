package Test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        char[] resultArr = {'零', '佰', '零', '拾', '零', '万', '零', '仟', '零', '佰', '零', '拾', '零', '元'};
        char[] upperCaseArr = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        Scanner sc = new Scanner(System.in);
        int money;
        while(true){
            System.out.print("输入你的余额：");
            money = sc.nextInt();
            if(money >= 0 && money <= 9999999) {
                break;
            }else{
                System.out.println("非法金额，重新输入");
            }
        }
        int count = 0;
        while(money > 0){
            count++;
            int ge = money % 10;
            char tmp = upperCaseArr[ge];
            resultArr[resultArr.length - (2 * count)] = tmp;
            money = money / 10;
        }
        String s = new String(resultArr); //s的地址与resultArr的不一样
        System.out.println(s);
    }
}
