package Extend;

public class ExtendMain {
    public static void main(String[] args) {
        //다형성은 상속관계에서만 사용 casting?
        Parent p1 = new Child(); //앞의 Parent form이라는 점이 중요

        p1.walk(); // == Child walk
        //!!!!!!!!!!! BUT parent Class에 walk method가 없으면 결과생성되지않음. error
        //bc Child Class Overrided walk method가 존재할 수 없기 때문

        System.out.println("===================");
        
        //Child c1 = new Parent(); ---- 클래스 간의 다운캐스팅 : 명시적으로 표현 필요
        //Child c1 = (Child) new Parent(); error

       // c1.run(); error 작성은 가능하지만 run불가
        //https://www.scientecheasy.com/2020/07/upcasting-and-downcasting-in-java.html/

        //c1.cook(); error
        //So, in the case of downcasting, we cannot access any of the methods of super class or sub class.

        Parent p2 = new Child();
        Child c2 = (Child) p2; //Converting super class reference type into sub class reference type.

        c2.cook(); //child 객체가 parent method도 사용가능
        c2.eat();
        c2.run(); // Child run







    }


}
