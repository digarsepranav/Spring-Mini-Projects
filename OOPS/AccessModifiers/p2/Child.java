package AccessModifiers.p2;

import AccessModifiers.p1.Parent;

public class Child extends Parent {
    void test() {
        Child p = new Child();
        System.out.println(p.d);
        System.out.println(p.c);
        // Only public accessible here
    }
    void test2() {
        System.out.println(this.c);
        System.out.println(this.d);
    }
}
