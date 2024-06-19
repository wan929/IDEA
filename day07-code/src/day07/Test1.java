package day07;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入机票原价：");
        double rawPrice = sc.nextDouble();
        System.out.println("输入月份：");
        int mouth = sc.nextInt();
        if(mouth > 12 || mouth < 1){
            System.out.println("输入的月份不合法！");
            return;
        }
        System.out.println("输入舱类：");
        String cang = sc.next(); //输入字符串
        if(!cang.equals("头等舱") && !cang.equals("经济舱")){
            System.out.println("输入的舱类不合法！");
            return;
        }

        double nowPrice = computePrice(rawPrice, mouth, cang);
        System.out.println("现在的票价是："+nowPrice);
    }

    public static double computePrice(double rawPrice, int mouth, String cang){
        double nowPrice = 0;
        if(mouth >= 5 && mouth <= 10){
            nowPrice = getNowPrice(rawPrice, cang, nowPrice, 0.9, 0.85);
        }else if(mouth >= 11 || mouth <= 4){
            nowPrice = getNowPrice(rawPrice, cang, nowPrice, 0.7, 0.65);
        }
        return nowPrice;
    }

    //ctrl + alt + M 自动抽取方法
    public static double getNowPrice(double rawPrice, String cang, double nowPrice, double v, double v2) {
        if (cang.equals("头等舱")) {
            nowPrice = rawPrice * v;
        } else if (cang.equals("经济舱")) { //Java中比较两个String对象的值，我们要用equals()，而不能用==（因为它比较的是两个对象的引用地址，即内存地址是否相同）；而对于基本数据类型，如byte、short、int等，==比较的就是它们的值了。
            nowPrice = rawPrice * v2;
        }
        return nowPrice;
    }
}