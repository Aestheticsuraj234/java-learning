package interfaces;

@FunctionalInterface
interface A {
    void methodA(int i , int j);
}


public class interfaces {
    public static void main(String[] args) {
        A a = ( i , j) -> System.out.println("Hello from methodA!");
        a.methodA(5, 10);
    }
}
