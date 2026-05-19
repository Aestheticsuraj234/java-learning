public class Hello {
    public static void main(String[] args) {
        // Relational Operators: == , != , > , < , >= , <=
        int a = 10, b = 5;
        System.out.println("a == b: " + (a == b));   // false
        System.out.println("a != b: " + (a != b));   // true
        System.out.println("a > b:  " + (a > b));    // true
        System.out.println("a < b:  " + (a < b));    // false
        System.out.println("a >= b: " + (a >= b));   // true
        System.out.println("a <= b: " + (a <= b));   // false

        // Logical Operators: && , || , !
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));   // false
        System.out.println("x || y: " + (x || y));   // true
        System.out.println("!x:     " + (!x));       // false

        // Bitwise Operators: & , | , ^ , ~ , << , >> , >>>
        int p = 12, q = 10; // 1100 and 1010 in binary
        System.out.println("p & q:  " + (p & q));    // 8  (1000)
        System.out.println("p | q:  " + (p | q));    // 14 (1110)
        System.out.println("p ^ q:  " + (p ^ q));    // 6  (0110)
        System.out.println("~p:     " + (~p));       // -13
        System.out.println("p << 1: " + (p << 1));   // 24
        System.out.println("p >> 1: " + (p >> 1));   // 6
        System.out.println("p >>> 1:" + (p >>> 1));  // 6

        // Assignment Operators: = , += , -= , *= , /= , %=
        int n = 10;
        n += 3;  System.out.println("n += 3:  " + n);  // 13
        n -= 2;  System.out.println("n -= 2:  " + n);  // 11
        n *= 2;  System.out.println("n *= 2:  " + n);  // 22
        n /= 4;  System.out.println("n /= 4:  " + n);  // 5
        n %= 3;  System.out.println("n %= 3:  " + n);  // 2

        // Increment and Decrement Operators: ++ , --
        int i = 5;
        System.out.println("i++: " + (i++));  // prints 5, then i is 6
        System.out.println("++i: " + (++i));  // i becomes 7, prints 7
        System.out.println("i--: " + (i--));  // prints 7, then i is 6
        System.out.println("--i: " + (--i));  // i becomes 5, prints 5

        // Ternary Operator: ? :
        int score = 75;
        String grade = (score >= 60) ? "Pass" : "Fail";
        System.out.println("Grade: " + grade);  // Pass
    }
}

// Relational Operators
// == , != , > , < , >= , <=
// Logical Operators
// && , || , !
// Bitwise Operators
// & , | , ^ , ~ , << , >> , >>>
// Assignment Operators
// = , += , -= , *= , /= , %=
// Increment and Decrement Operators
// ++ , --
// Ternary Operator
// ? :
