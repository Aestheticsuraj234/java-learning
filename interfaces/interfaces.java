package interfaces;

@FunctionalInterface
interface A {
    int methodA(int i , int j);
}


public class interfaces {
    public static void main(String[] args) {
            A a = ( i , j) -> i+j;
            
            int result = a.methodA(5, 10);
            System.out.println("Result: " + result);
    }
}
