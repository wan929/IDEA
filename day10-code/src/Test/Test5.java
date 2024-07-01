package Test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("输入字符串:");
        while(true){
            s = sc.next();
            if(s.length() > 9 || !isNumberString(s)){
                System.out.print("输入的字符串不符合要求，重新输入：");
            }else{
                break;
            }
        }
        String romanString = arabicStringToRomanString(s);
        System.out.println(romanString);

    }
    public static boolean isNumberString(String s){
        boolean flag = true;
        for(int i = 0; i < s.length(); i++){
            if (s.charAt(i) > '0' && s.charAt(i) < '9') {
                continue;
            }else{
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static String arabicStringToRomanString(String s){
        String[] arabicToRomanArray = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            sb.append(arabicToRomanArray[s.charAt(i) - '0']);
        }
        return sb.toString();
    }
}
