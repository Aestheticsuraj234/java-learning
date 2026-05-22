package annotations_;


class A {
    
    public void showTheDataWhichBelongsToThisCLass(){
        System.out.println("Hello Java!");
    }
}

class B extends A {
  
    @Override
    public void showTheDataWhichBelongsToThisCLass() {
        System.out.println("Hello Java from B!");
    }
}

public class annotations {
    public static void main(String[] args) {
        B b = new B();
        b.showTheDataWhichBelongsToThisCLass();
    }
}
