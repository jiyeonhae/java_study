package Management;

import javax.swing.*;

public class ManagementMain {
    public static void main(String[] args) {
        
        //One pattern -> Member에게 -> Member가 사용
        Member m1 = new Member();//생성
        m1.setAge(11);
        m1.setUserName("Max"); //객체로서 저장

        One group = new One(); // One form(Class)의 group instance 생성
        group.set_class("AA"); //group 값 설정
        group.setSubject("Java");

        m1.setGroup(group); //위의 값을 Member안의 Group에 전달 !!!!!!!
        //값이 설정된 group class를 m1 class에 맵핑


        String name = m1.getUserName();
        int age = m1.getAge();

        m1.getGroup().get_class(); // bring value from m1 - Group (One) - class variable
        m1.getGroup().getSubject(); //ctrl + alt + v로 변수 생성해줌
        //https://ehdvudee.tistory.com/m/31


        String m1Class = group._class;
        String m1Subject = group.subject;


        System.out.println( name + "_" + age );
        System.out.println(m1.age);
        System.out.println( m1Class + " & " + m1Subject);
        System.out.println(m1.getGroup()._class);
        //is - a : inheritance
        //has - a : have certain value


    }
}
