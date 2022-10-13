public class Parent {

    String name;

    Parent()
    {
        System.out.println("Parent");
    }

    String getName() {
        return name;
    }

    void render ()
    {
        System.out.println(name);
    }

    void render (String status, int rate)
    {
        System.out.println(status + " : " + rate + "%");
    }
}
