package Pac1;

public class MemberMain {
    //기본생성자? 는 여기에

    public static void main(String[] args) {
        //!!!!!!!!!!!!!!!!!!!!!!!!!!!! stack hip 등 data 구조 정리해오기!!!!!!!!!!!!!!!!!!!

        Member m = new Member();
        Member n = new Member();
        //stack 동 ---new는 heap 연산자
        //member라는 zone에 자리가 들어갈것이다 표시 -- heap에 Member m or n의 값이 결정되면 자리부여됨 -- 같은 클래스 다른 주소

        m.id = "id111";
        n.id = "id222";



        if (m == n) {
            System.out.println("same");
        }
        else System.out.println("different"); //id 가 아니더라도 걍 주소가 달라서 다름으로 결과나옴






        Member[] mArray = new Member[3];  //클래스를 배열구조로 사용하기
        mArray[0] = new Member();
        mArray[1] = new Member();
        mArray[2] = new Member(); // initialize


        mArray[0].setId("id0");
        mArray[1].setId("id1");
        mArray[2].setId("id2");  //set value


        for (Member element: mArray) {
            String str = element.getId(); //return value
            System.out.println(str);
        }








    }
}
