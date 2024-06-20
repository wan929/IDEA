package day07;

public class Test2 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 101; i <= 200; i++){
            if(isPrime(i)){
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("一共有" + count +"个素数");
        return;
    }

    public static boolean isPrime(int number){
        if(number >= 101 && number <= 200){
            boolean flag = true;
            for(int i = 2; i < number; i++){
                if(number % i == 0){
                    flag = false;
                    break;
                }
            }
            return flag;
        }else{
            System.out.println("number不在要求的范围内！");
            return false;
        }
    }
}
