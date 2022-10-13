public class MainPC {
    public static void main(String[] args) {


        //!!!!!!!!!!Package말고 directory만 생성될시 -- directory - properties - mark as source root!!!!!

    Child c = new Child();  //Child 객체 생성 이전 Parent가 우선 생성 -> Child


    c.age = 22;
    c.name = "Mac";

    c.render();
    //parent의 메서드를 override

    c.render("hungry", 45);
    //parent의 overloaded method를 override !!!!둘다 이루어진 상태 가능

    System.out.println("==========================");

    Child c2 = new Child();;
    c2.render(33, "Raps");
    //override

    System.out.println("============================");

    Parent p = new Parent();

    p.name = "Apple";
    p.render();

    }

}
