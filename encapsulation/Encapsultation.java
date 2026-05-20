package encapsulation;

class Human{
   private int age;
    private String name;

  public Human(int age, String name){
    this.age = age;
    this.name = name;
  }

  public int getAge(){
    return age;
  }

  public String getName(){
    return name;
  }
   
    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }                               

   
}


public class Encapsultation {
 public static void main(String[] args) {
    Human h1 = new Human(22, "Suraj");

    System.out.println(h1.getAge() + " " + h1.getName());
 }
}
