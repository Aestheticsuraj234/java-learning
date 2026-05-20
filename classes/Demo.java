package classes;

class A{
    public A(){
        System.out.println("A is called");
    }

    public void show(){
        System.out.println("Show is called");
    }

}


class Demo {
    public static void main(String[] args) {

        int marks;
        marks = 90;

        A obj;
        obj = new A();
        obj.show();

        System.out.println("Hello World");
    }
}
