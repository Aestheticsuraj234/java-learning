package enums;

enum Status{
  RUNNING , STOPPED , PAUSED
}

public class enums {
    public static void main(String[] args) {
     Status s = Status.PAUSED;

     switch(s){
        case RUNNING:
            System.out.println("The status is running");
            break;
        case STOPPED:
            System.out.println("The status is stopped");
            break;
        case PAUSED:
            System.out.println("The status is paused");
            break;
     }

     
     if(s == Status.PAUSED){
        System.out.println("The status is paused");
     }
     else{
        System.out.println("The status is not paused");
     }
    }
}
