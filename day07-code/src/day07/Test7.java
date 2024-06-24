package day07;

import java.util.Random;

public class Test7 {
    public static void main(String[] args) {
        //模拟
//        int[] bonusArray = {2, 588, 888, 1000, 10000};
//        int len = bonusArray.length;
//        String temp = "元的奖金被抽出";
//        Random r = new Random();
//        boolean[] indexArray = new boolean[len];
//        for(int i = 0; i < len; i++){
//            indexArray[i] = false;
//        }
//        for(int i = 0; i < len;){
//            int index = r.nextInt(len);
//            //System.out.println(index);
//            if(indexArray[index] == false){
//                i++;
//                System.out.println(bonusArray[index]+temp);
//                indexArray[index] = true;
//            }else{
//                continue;
//            }
//        }

        //直接打乱数组顺序，也能达到目的；
        int[] bonusArray = {2, 588, 888, 1000, 10000};
        int len = bonusArray.length;
        String tempString = "元的奖金被抽出";
        Random r = new Random();
        for(int i = 0; i < 10; i++){
            int randomIndex1 = r.nextInt(len);
            int randomIndex2 = r.nextInt(len);
            int tempNumber = bonusArray[randomIndex2];
            bonusArray[randomIndex2] = bonusArray[randomIndex1];
            bonusArray[randomIndex1] = tempNumber;
        }
        for(int i = 0; i < len; i++){
            System.out.println(bonusArray[i]+tempString);
        }
    }
}
