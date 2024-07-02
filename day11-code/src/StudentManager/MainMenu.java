package StudentManager;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        while(true){
            System.out.println("-------------欢迎来到学生管理系统-------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出系统");
            System.out.print("请输入您的选择：");
            String selectNumber = sc.next();
            switch(selectNumber){
                case "1" -> addStudent(list);
                case "2" -> removeStudent(list);
                case "3" -> modifyStudentInformation(list);
                case "4" -> printStudentInformation(list);
                case "5" -> {
                    exit();
                    System.exit(0); //JVM停止运行
                }
                default -> exit();
            }
            if(selectNumber == "5"){
                break;
            }
        }
    }

    public static boolean addStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.println("请输入学生信息");
        System.out.println("输入学生id：");
        String s_id = sc.next();
        if(isExist(s_id, list)){
            System.out.println("此id已存在，添加失败");
            return false;
        }else{
            s.setId(s_id);
            System.out.println("输入学生姓名：");
            String s_name = sc.next();
            s.setName(s_name);
            System.out.println("输入学生年龄：");
            int s_age = sc.nextInt();
            s.setAge(s_age);
            System.out.println("输入学生家庭住址：");
            String s_address = sc.next();
            s.setAddress(s_address);

            list.add(s);
            System.out.printf("添加%s学生成功", s_id);
            System.out.println();
            return true;
        }
    }

    public static int getIndex(String id, ArrayList<Student> list){
        for(int i = 0; i < list.size(); i++){
            if(id.equals(list.get(i).getId())){
                return i; //id已存在
            }
        }
        return -1; //id不存在
    }

    public static boolean isExist(String id, ArrayList<Student> list){
        return getIndex(id, list) >= 0;
    }

    public static boolean removeStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入需要删除的学生id：");
        String targetId = sc.next();
        int index = getIndex(targetId, list);
        if(index >= 0){
            list.remove(index);
            System.out.printf("删除%s学生成功", targetId);
            System.out.println();
            return true;
        }else{
            System.out.printf("目标%s学生不存在，删除失败", targetId);
            System.out.println();
            return false;
        }
    }

    public static boolean modifyStudentInformation(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入需要修改的学生id：");
        String targetId = sc.next();
        int index = getIndex(targetId, list);
        if(index >= 0){
            Student s = list.get(index);
            System.out.println("输入学生姓名：");
            String s_name = sc.next();
            s.setName(s_name);
            System.out.println("输入学生年龄：");
            int s_age = sc.nextInt();
            s.setAge(s_age);
            System.out.println("输入学生家庭住址：");
            String s_address = sc.next();
            s.setAddress(s_address);
            System.out.printf("修改%s学生信息成功", targetId);
            System.out.println();
            return true;
        }else{
            System.out.printf("目标%s学生不存在，修改失败", targetId);
            System.out.println();
            return false;
        }
    }

    public static boolean printStudentInformation(ArrayList<Student> list){
        if(list.size() == 0){
            System.out.println("没有学生信息，请添加后再打印");
            return false;
        }else{
            System.out.println("id\t姓名\t年龄\t家庭住址");
            for(int i = 0; i < list.size(); i++){
                Student s = list.get(i);
                System.out.printf("%s\t%s\t%d\t%s", s.getId(), s.getName(), s.getAge(), s.getAddress());
                System.out.println();
            }
            return true;
        }
    }

    public static void exit(){
        System.out.println("退出系统");
    }
}
