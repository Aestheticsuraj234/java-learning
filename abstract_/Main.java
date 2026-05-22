package abstract_;

// class -- class // extends
//  interface -- interface // extends
// class -- interface // implements
// interface -- class // not possible

interface A {
    int age = 25;
    String area = "pune";

    void show();

    void connect();
}

interface C {
    void display();
}

class B implements A, C {
    public void show() {
        System.out.println("show method");
    }

    public void connect() {
        System.out.println("connect method");
    }

    public void display() {
        System.out.println("display method");
    }
}

public class Main {
    public static void main(String[] args) {
        A obj;
        obj = new B();
        obj.show();
        obj.connect();

        C obj1;
        obj1 = new B();
        obj1.display();
    }
}
