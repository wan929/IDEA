package Test;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {};
        String result = arrToString(arr);
        System.out.println(result);

    }
    public static String arrToString(int[] arr){
        if(arr == null){
            return "";
        }else if(arr.length == 0){ //[]
            return "[]";
        }
        String result = "";
        result += "[";
        for(int i = 0; i < arr.length; i++){
            result += arr[i];
            if(i != arr.length - 1){
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}
