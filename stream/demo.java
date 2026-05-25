package stream;

import java.util.Arrays;
import java.util.List;

public class demo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
               .filter(n -> n % 2 == 0) // Filter only even numbers
               .map(n -> n * 2)          // Double the even numbers
               .forEach(n -> System.out.println(n)); // Print each doubled even number

        // numbers.forEach(n -> System.out.println(n));


















        // int sum = 0;
        // // Filter only even numbers and print them
        // for(int n: numbers) {
        //     if(n % 2 == 0) {
        //         n = n*2; 
        //         sum = sum + n;
        //         System.out.println(n);
                
        //     }
        // }

        System.out.println("Sum of doubled even numbers: " + sum);
        System.out.println("Stream-related code will go here.");
    }
}
