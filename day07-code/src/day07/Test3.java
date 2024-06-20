package day07;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        String result = "";
        Random r = new Random();
        for(int i = 0; i < 4; i++){
            int choice = r.nextInt(2);  // 随机生成 0 或 1
            int randomNumber;
            if (choice == 0) {
                randomNumber = r.nextInt(90 - 65 + 1) + 65; //A-Z
            } else {
                randomNumber = r.nextInt(122 - 97 + 1) + 97; //a-z
            }
            char letter = (char)(randomNumber); //转为char类型
            result += letter;
        }
        int num = r.nextInt(10); //随机产生0-9的随机数
        result += num;
        System.out.println("验证码是"+result);
    }
}
