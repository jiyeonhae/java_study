public class Child extends Parent
{
    //쌤꺼보고 적어두기
    int age;

    Child()
    {
        System.out.println("Child");
    }

    int getAge ()
    {
        return age;
    }

    void render () //Parent의 render method가 override되서 우선적용
    {
        System.out.println(super.name + " " + this.age);
    }

    void render (int age, String name)
    {
        System.out.println("parameter contained");
        System.out.println(age+ " + " + name);
    }
}
