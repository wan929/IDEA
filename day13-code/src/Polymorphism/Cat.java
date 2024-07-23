package Polymorphism;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String sth){
        System.out.printf("%d岁的%s颜色的猫眯着眼睛侧着头吃%s", getAge(), getColor(), sth);
    }

    public void catchMouse(){
        System.out.println("猫猫在抓老鼠");
    }
}
