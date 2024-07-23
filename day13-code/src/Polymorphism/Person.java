package Polymorphism;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a, String sth) {
        if(a instanceof Dog) {
            Dog d = (Dog)a;
            System.out.printf("年龄为%d岁的%s养了一只%s颜色的%d岁的狗", getAge(), getName(), a.getColor(), a.getAge());
            System.out.println();
            a.eat(sth);
            System.out.println();
            d.lookhome();
        }else if(a instanceof Cat){
            Cat c = (Cat)a;
            System.out.printf("年龄为%d岁的%s养了一只%s颜色的%d岁的猫", getAge(), getName(), a.getColor(), a.getAge());
            System.out.println();
            a.eat(sth);
            System.out.println();
            c.catchMouse();
        }else{
            System.out.println("没有对应的子类");
        }
    }
}
