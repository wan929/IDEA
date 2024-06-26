package Test1;

import java.util.Random;

public class GameRole {
    private String name;
    private int HP;

    public GameRole(){}
    public GameRole(String name, int HP){
        this.name = name;
        this.HP = HP;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setHP(int HP){
        this.HP = HP;
    }
    public  int getHP(){
        return this.HP;
    }

    void fight(GameRole gr){
        Random r = new Random();
        int hurt = r.nextInt(20) + 1; //1-20的伤害
        int remainHP = (gr.getHP() - hurt) >= 0 ? (gr.getHP() - hurt) : 0;
        gr.setHP(remainHP);
        System.out.println(this.getName()+"举起拳头打了"+gr.getName()+"一下，"+"造成了"+hurt+"点伤害，"+gr.getName()+"还剩下"+remainHP+"点血。");
    }
}
