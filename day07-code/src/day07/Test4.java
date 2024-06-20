package day07;

public class Test4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr2 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }
        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
}
