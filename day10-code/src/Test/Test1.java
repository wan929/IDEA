package Test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        String rightName = "wananbang";
        String rightPassword = "20000929";
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while (count < 3) {
            System.out.println("输入您的用户名：");
            String myName = sc.next();
            System.out.println("输入您的密码：");
            String myPassword = sc.next();
            if(myName.equals(rightName) && myPassword.equals(rightPassword)){
                System.out.println("登录成功");
                break;
            }else{
                System.out.printf("用户名或密码错误，还剩下%d次机会", 2 - count);
                System.out.println();
                count++;
                if(count == 3){
                    System.out.println("已冻结");
                }
            }
        }
    }
}
