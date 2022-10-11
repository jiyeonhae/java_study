package pac2;

public class Look {
    int age;
    Look ()
    {
        age = 0;
    } //기본생성자 : 따로 작성하지 않아도 자동생성/ 클래스 생성 직후에 호출됨 == 클래스 생성시에 필수.

    Look (int a)
    {
        //age = a; //지역변수 -- 위에 int age보다 우선시 됨

        this.age = 0; // -- 저 위의 age를 해당값으로 설정하겠다. 지역변수말고 전역변수를 설정하고 싶을때
        //복사생성자 : 사용자가 호출할때 생성됨
        //복사생성자를 사용할려면 기본생성자도 만들어주기 --> 그래야 생성자 활용시 매개변수 없는 생성자도 사용가능 (if we need)
    }

    void output() {
        System.out.println(age);
    }





}
