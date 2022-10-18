package Management;

public class Member extends Parent{

    String userName;
    int age;
    //alt + insert == code generator

    One group; //has - a; //소속으로 치자
    //이름바꾸기는 refactor -> rename


    public One getGroup() {
        return group;
    }

    public void setGroup(One group) {
        this.group = group;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
