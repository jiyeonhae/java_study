package Pac1;

public class Member {
    //getter 참조
    //setter 변경

    // 객체지향의 4단계 = initialize 생성 progress 변경 render(update) 갱신 release(delete) 삭제

    public String id;
    private String userName;
    private Integer age;
/////////////////////////////////////////////////data
    //생성자
    //메서드
    public String getId() {return id;}
    void setId(String id) { this.id = id;}

    public String getUserName() {return userName;}
    void setUserName(String userName) {this.userName = userName;}

    public Integer getAge() {return age;} //code generate getter/setter로 성성
    public void setAge(Integer age) {this.age = age;}
    
    //접근제어자 반환값의데이터타입 함수이름 (매개변수 파라미터 -- 지역변수임) { return 반환값;}
//////////////////////////////////////function          data + function = capsule화
}
