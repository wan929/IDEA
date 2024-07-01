package Test;
public class Test6 {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "eabcd";
        if(s1.length() != s2.length()){
            System.out.println("不匹配");
            return;
        }
        else if(twoStringIsSame(s1, s2)){
            System.out.println("匹配");
            return;
        }
        for(int i = 1; i <= s1.length() - 1; i++){
            String s3 = rotateString(s1, i);
            if(twoStringIsSame(s3, s2)){
                System.out.println("匹配");
                return;
            }
        }
        System.out.println("不匹配");
    }

    public static String rotateString(String s, int num){
        String s1 = s.substring(0, num);
        System.out.println(s1);
        String s2 = s.substring(num);
        System.out.println(s2);
        String resultString = s2 + s1;
        return resultString;
    }

    public static boolean twoStringIsSame(String s1, String s2){
        return s1.equals(s2);
    }
}
