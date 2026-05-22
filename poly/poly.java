package poly;

class Computer{

}

class Laptop extends Computer{
    
}


class A{
    public void show(){
        System.out.println("Show in A");
    }
}

class B extends A{
    public void show(){
        System.out.println("Show in B");
    }
}

class C extends A {

}
public class poly {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();



    }
}
