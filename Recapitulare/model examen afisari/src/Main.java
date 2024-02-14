interface A {
    public void test(String a);
}

class B {
    static int x = 0, y;

    B() {
        x++;
        y = x;
        System.out.println(test(y));
    }

    String test(int z) {
        x += z;
        return "x= " + x + " y = " + y;
    }
}

class C extends B implements A {
    C() {
        System.out.println(x);
    }

    C(int x) {
        this.x = x * 10;
        System.out.println(x);
    }

    public void test(String a) {
        System.out.println(a + test(a.length()));
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new C(3);
        a.test("CORECT");
        B b = new C();

    }
}