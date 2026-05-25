package threads_;

class A implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("A: " + i);
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hello: " + i);
              try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}
public class code {
    public static void main(String[] args) {
        Runnable a = new A();
        Runnable b = new B();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();

    }
}
