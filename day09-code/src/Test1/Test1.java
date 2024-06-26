package Test1;

public class Test1 {
    public static void main(String[] args) {
        GameRole gr1 = new GameRole("乔峰", 100);
        GameRole gr2 = new GameRole("马大腿", 100);
        while (true){
            gr1.fight(gr2);
            if(gr2.getHP() == 0){
                System.out.println(gr1.getName()+"KO了"+gr2.getName());
                break;
            }
            gr2.fight(gr1);
            if(gr1.getHP() == 0){
                System.out.println(gr2.getName()+"KO了"+gr1.getName());
                break;
            }
        }
    }
}
