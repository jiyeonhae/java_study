package Management;

public class Member extends Parent{

    String userName;
    int age;
    //alt + insert == code generator

    One group; //has - a : 상속이 아니지만 포함되는 관계 벤다이어그램으로 생각하면 됨
    //member마다 group이 하나씩있음
    //상속이 아니더라도 다른 class의 값을 가질 수 있음
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
