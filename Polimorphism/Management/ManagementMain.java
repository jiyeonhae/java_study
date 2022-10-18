package Management;

import javax.swing.*;

public class ManagementMain {
    public static void main(String[] args) {
        
        //One pattern -> Member에게 -> Member가 사용
        Member m1 = new Member();
        m1.setAge(11);
        m1.setUserName("Max"); //DB 확인

        One group = new One();
        group.set_class("AA");
        group.setSubject("Java");

        m1.setGroup(group);



        String name = m1.getUserName();
        int age = m1.getAge();
        group = m1.getGroup();
        m1.getGroup().get_class();
        m1.getGroup().getSubject();


        System.out.println( name + age );

        //is - a : inheritance
        //has - a : get certain value
    }
}
