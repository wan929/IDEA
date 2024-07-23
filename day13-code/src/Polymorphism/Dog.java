package Polymorphism;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String sth){
        System.out.printf("%d岁的%s颜色的狗两只前腿死死的抱住%s猛吃", getAge(), getColor(), sth);
    }

    public void lookhome() {
        System.out.println("狗狗在看家");
    }
}
