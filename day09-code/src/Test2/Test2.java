package Test2;

public class Test2 {
    public static void main(String[] args) {
        GameRole gr1 = new GameRole("乔峰", 100, "男");
        GameRole gr2 = new GameRole("诗诗", 100, "女");

        gr1.showRoleInformation();
        gr2.showRoleInformation();

        while (true){
            gr1.fight(gr2);
            if(gr2.getBlood() == 0){
                System.out.println(gr1.getName()+"KO了"+gr2.getName());
                break;
            }
            gr2.fight(gr1);
            if(gr1.getBlood() == 0){
                System.out.println(gr2.getName()+"KO了"+gr1.getName());
                break;
            }
        }
    }
}
