package AccessModifiers.p1;

public class SamePkg {
    void test() {
        Parent p = new Parent();
//        System.out.println(p.a);    // private cannot be accessed
        System.out.println(p.b);
        System.out.println(p.c);
        System.out.println(p.d);
    }
}
