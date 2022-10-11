package pac2.Test.Ex1;

public class ExMain {
   /* public static void main(String[] args)
    {
        Pac2Ex test1 = new Pac2Ex();
        Pac2Ex test2 = new Pac2Ex();
        Pac2Ex test3 = new Pac2Ex();
    }*/
    
    //싱글톤 : instance가 필요할 때 위처럼 다른 객체를 계속 생성하는게 아니라 하나의 instance를, 기존의 instance를 활용하는 패턴
    //    - 객체는 하나/ - 생성이후의 호출된 생성자는 이미 생성된 객체를 반환

    private static ExMain instance = new ExMain(); //전역임 -----> 장: 데이터 공유의 편의성


    private ExMain()  // private으로 재생성 못하게 함
    {

    }

     public static ExMain getInstance()
     {
         return instance;
     }
}
