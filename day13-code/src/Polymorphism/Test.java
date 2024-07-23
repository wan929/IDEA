package Polymorphism;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("万安帮", 24);
        Person p2 = new Person("马鑫磊", 23);
        Dog d = new Dog(2, "yellow"); //注意这里定义Dog类
        Cat c = new Cat(3, "white"); //注意这里定义Cat类
        p1.keepPet(d, "骨头");
        System.out.println();
        p2.keepPet(c, "鱼");
        return;
    }
}
