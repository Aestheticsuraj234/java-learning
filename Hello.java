public class Hello {
    public static void main(String[] args) {
       int num1 = 10;
       int num2 = 20;

       int sum = num1 + num2;

       float num3 = 10.5f;
       float sum2 = num1 + num3;

        char char1 = 'A';
        char char2 = 'B';
        char2 = char1; // implicit casting
        char sum3 = (char) (char1 + char2); // type casting ( explicit casting )

        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println("Sum of " + num1 + " and " + num3 + " is " + sum2);
        System.out.println("Sum of " + char1 + " and " + char2 + " is " + sum3);

    }
}

// Primitive Data types
// 1. int (byte , short , int , long)
// 2. float (float , double)
// 3. char (char)
// 4. boolean (boolean)
