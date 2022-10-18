package Interface;

public class InterfaceEx {

    //extends 클래스 하나 상속 와 implement 여러 인터페이스 상속가능

    //https://medium.com/@isaacjumba/overview-of-inheritance-interfaces-and-abstract-classes-in-java-3fe22404baf8

    //인페는 선언만 -->
    //해당 인페를 가질 객체는 이 안의 추상메서드를 !무조건! 정의해야함 직렬
    //the exact same signature (name + parameters) as declared in the interface.
    // The class does not need to implement (declare) the variables of an interface. Only the methods.
    //상속은 골라서, 다른 이름으로도 오버라이딩 할 수 있음 병렬------- 차이점
    //Object는 모든 클래스의 부모클래스
    // In other words, constructors of a super-class are not inherited by subclasses.
    
    //======절대 빠지면 안되는 부분에 사용하면 굳
    
    //Interface -> abstract class -> 다음 클래스에서도 같은 메서드랑 틀이 적용됨

    //인페 두 객체는 서로 다른 형질(클래스?객체?)로 인식
    //상속은 두 객체가 같은 형질(클래스?)로 인식
    
        //Find - Move                Run
                                // find move가 선행조건
    
    //                          interface는 copy 내용 그대로 받아와야 -- 
    //                          상속은.....상위를 재사용 정의 재정의 자유로움 /오버라이딩시 부모정의랑 충돌가능성 - 주의점
    //둘다 사용한거 아닌가


    //추상클래스와 인터페이스 차이
    // Java interfaces are used to make the classes using the interface independent of the classes implementing the interface.
    // Thus, you can exchange the implementation of the interface, without having to change the class using the interface.
    // On the other hand, abstract classes are typically used as base classes for extension by subclass.


    //인간 class - army           무기 class - gun
    //군인이 총을 사용하게 할 때 상속xxxx 인간과 무기는 상속개념이 아님


    //Inheritance is an OOP concept to derive new classes from the existing classes.   code reusability.
    //inheritance is to derive new classes from existing classes

    //Interface is a mechanism in OOP to implement abstraction and multiple inheritance    abstraction and multiple inheritance.
    //interfaces is to implement abstract classes and multiple inheritance.
}
