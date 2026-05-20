class A{
    String name = "parent";

    public A(){
        System.out.println("A is called");
    }

    public A(String label){
        System.out.println("A(" + label + ") is called");
    }

    void printName(){
        System.out.println("A.printName: " + name);
    }

    void greet(){
        System.out.println("Hello from A");
    }
}

class B extends A{
    String name = "child"; // shadows parent's field

    public B(){
        super(); // calls parent's no-arg constructor (must be first line)
        System.out.println("B is called");
    }

    public B(String label){
        super(label); // calls parent constructor A(String)
        System.out.println("B(" + label + ") is called");
    }

    @Override
    void printName(){
        System.out.println("B.printName (overridden): " + name);
    }

    @Override
    void greet(){
        super.greet(); // call parent's version, then add child behavior
        System.out.println("Hello from B");
    }

    void showThisAndSuper(){
        System.out.println("this.name = " + this.name);       // child's field
        System.out.println("super.name = " + super.name);     // parent's field
        this.printName();  // calls overridden B.printName
        super.printName(); // explicitly parent's version (not overridden path)
    }
}

// this() chains to another constructor in the SAME class
class B2 extends A{
    public B2(){
        this("default"); // must be first line; cannot use super() here too
        System.out.println("B2 no-arg done");
    }

    public B2(String label){
        super(label);
        System.out.println("B2(" + label + ") is called");
    }
}

class C extends B{
    public C(){
        System.out.println("C is called");
    }

    @Override
    void greet(){
        super.greet();
        System.out.println("Hello from C");
    }
}

class D extends C{
    public D(){
        System.out.println("D is called");
    }
}

// Method overriding: child class provides its own implementation of a parent method.
// Rules: same name + parameters + compatible return type; cannot reduce visibility.
// @Override helps catch mistakes. JVM uses the actual object type at runtime (polymorphism).

// Do we support multiple inheritance in java?
// No, we don't support multiple inheritance in java.
// But we can achieve multiple inheritance using interfaces.
// Interfaces are a way to achieve multiple inheritance in java.
// Interfaces are a way to achieve multiple inheritance in java.



public class Inheritance {
    public static void main(String[] args) {
        System.out.println("--- super(): constructor chain ---");
        D obj = new D();

        System.out.println("\n--- super(label) + this vs super fields ---");
        B b = new B("fromMain");
        b.showThisAndSuper();

        System.out.println("\n--- this(): same-class constructor chaining ---");
        B2 b2 = new B2();

        System.out.println("\n--- Method overriding ---");
        A parentRef = new B("overrideDemo"); // parent type, child object
        parentRef.greet(); // runs B.greet(), not A.greet()
        parentRef.printName();

        System.out.println();
        C c = new C();
        c.greet(); // B then C via super chain
    }
}
