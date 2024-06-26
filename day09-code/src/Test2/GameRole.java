package Test2;

import java.util.Random;

public class GameRole {
    private String name;
    private int blood;
    private String gender;
    private String face;

    String[] boyFaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlFaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    //attack 攻击描述：
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //injured 受伤描述：
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public GameRole() {
    }

    public GameRole(String name, int blood, String gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        //face随机，在这里直接调用setFace方法
        setFace(gender); //这个需要注意为什么是这样写
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String gender) {
        Random r = new Random();
        if (gender == "男") {
            int index = r.nextInt(boyFaces.length);
            this.face = boyFaces[index];
        } else if (gender == "女") {
            int index = r.nextInt(girlFaces.length);
            this.face = girlFaces[index];
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getBlood() {
        return this.blood;
    }

    public void fight(GameRole gr) {
        //攻击效果
        Random r = new Random();
        int fightIndex = r.nextInt(attacks_desc.length);
        System.out.printf(attacks_desc[fightIndex], this.getName(), gr.getName());
        System.out.println();

        //计算伤害
        int hurt = r.nextInt(20) + 1; //1-20的伤害
        int remainBlood = (gr.getBlood() - hurt) >= 0 ? (gr.getBlood() - hurt) : 0;
        gr.setBlood(remainBlood);

        //受伤效果
        int injureIndex;
        if(remainBlood == 100){
            injureIndex = 0;
        }else if(remainBlood > 90){
            injureIndex = 1;
        }else if(remainBlood > 75){
            injureIndex = 2;
        }else if(remainBlood > 60){
            injureIndex = 3;
        }else if(remainBlood > 40){
            injureIndex = 4;
        }else if(remainBlood > 20){
            injureIndex = 5;
        }else if(remainBlood > 0){
            injureIndex = 6;
        }else{
            injureIndex = 7;
        }
        System.out.printf(injureds_desc[injureIndex], gr.getName());
        System.out.println();

//        System.out.println(this.getName() + "举起拳头打了" + gr.getName() + "一下，" + "造成了" + hurt + "点伤害，"
//                + gr.getName() + "还剩下" + remainBlood + "点血。");
    }

    public void showRoleInformation() {
        System.out.println("名字为：" + this.getName());
        System.out.println("血量为：" + this.getBlood());
        System.out.println("性别为：" + this.getGender());
        System.out.println("长相为：" + this.getFace());
    }
}
