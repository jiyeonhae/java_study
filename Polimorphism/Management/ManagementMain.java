package Management;

import javax.swing.*;

public class ManagementMain {
    public static void main(String[] args) {
        
        //One pattern -> Member에게 -> Member가 사용
        Member m1 = new Member();
        m1.setAge(11);
        m1.setUserName("Max"); //DB 확인

        One group = new One(); // One form의 group instance
        group.set_class("AA"); //group 값 설정
        group.setSubject("Java");

        m1.setGroup(group); //위의 값을 Member안의 Group에 전달



        String name = m1.getUserName();
        int age = m1.getAge();

        m1.getGroup().get_class(); // bring value from m1 - Group (One) - class variable
        m1.getGroup().getSubject();

        String m1Class = group._class;
        String m1Subject = group.subject;


        System.out.println( name + "_" + age );
        System.out.println( m1Class + " & " + m1Subject);
        //is - a : inheritance
        //has - a : get certain value
    }
}
