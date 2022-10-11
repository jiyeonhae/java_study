package pac2.Test.Ex1;

// 클래스 하나만 호출 import pac2.Test.Ex1.Pac2Ex;
// import pac2.Test.*; *하면 이전 위치 파일 내부의 모든 클래스 호출됨

public class Pac2Ex {
    ExMain singleton1 = ExMain.getInstance();
    
    //ExMain singleton2 = new ExMain();  error -- new로 새 객체 재생성 불가
}
