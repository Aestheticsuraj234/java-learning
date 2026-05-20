package basics;

public class Hello {
    public static void main(String[] args) {
    // While Loop
        
    // // do while loop
    // int i = 1;
    // do{
    //     System.out.println("Hello" + i);
    //     i++;
    // }while(i <= 10);


    //for loop
    for(int i = 1; i <= 10; i++){
        System.out.println("Hello" + i);
        int j = 1;
        while(j<=3){
            System.out.println("World" + j);
            j++;
        }
    }
    System.out.println();
 
    }
}
