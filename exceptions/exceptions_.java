package exceptions;

public class exceptions_ {
    public static void main(String[] args) {
       int j = 0;
       int i = 0;

       try{
        j = 18/i;
       }
       catch(Exception e){
        System.out.println("An error occurred: " + e.getMessage());
       }
       finally{
        System.out.println("This block will always execute.");
       }

         System.out.println("Value of j: " + j);

    }
}
