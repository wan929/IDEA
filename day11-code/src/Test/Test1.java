package Test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("001", "Tom", "123");
        User u2 = new User("002", "Bob", "231");
        User u3 = new User("003", "Angle", "1434");
        list.add(u1);
        list.add(u2);
        list.add(u3);

        System.out.println(checkUser("003", list));
    }

    public static boolean checkUser(String id, ArrayList<User> list){
        return getIndex(id, list) >= 0; //代码复用
    }

    public static int getIndex(String id, ArrayList<User> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
}
