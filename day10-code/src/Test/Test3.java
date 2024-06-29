package Test;

public class Test3 {
    public static void main(String[] args) {
        String s = null;
        String result = reverseString(s);
        System.out.println(result);
    }
    public static String reverseString(String s){
        if(s == null){
            return "";
        }else if(s == ""){
            return "";
        }else{
            String result = "";
            for(int i = s.length() - 1; i >= 0; i--){
                char c = s.charAt(i);
                result += c;
            }
            return result;
        }
    }
}
