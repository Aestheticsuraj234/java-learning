package abstract_;

abstract class Computer {
    public abstract void code();
}

class Laptop extends Computer {
    public void code() {
        System.out.println("Code ,Compile , Run");
    }
}

class Desktop extends Computer {
    public void code() {
        System.out.println("Code ,Compile , Run");
    }
}

class Developer {
    public void devApp(Laptop lap) {
        lap.code();

    }
}

public class Main {
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer dev = new Developer();

        dev.devApp((Laptop) lap);

    }
}