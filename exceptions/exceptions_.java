package exceptions;

public class exceptions_ {
    public static void main(String[] args) {
        
        // 1. ArithmeticException - Division by zero
        System.out.println("=== 1. ArithmeticException ===");
        try {
            int j = 18 / 0;  // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.\n");
        }

        // 2. ArrayIndexOutOfBoundsException
        System.out.println("=== 2. ArrayIndexOutOfBoundsException ===");
        try {
            int[] array = {1, 2, 3};
            int value = array[5];  // Index out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.\n");
        }

        // 3. NullPointerException
        System.out.println("=== 3. NullPointerException ===");
        try {
            String str = null;
            int length = str.length();  // Calling method on null object
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.\n");
        }

        // 4. ClassCastException
        System.out.println("=== 4. ClassCastException ===");
        try {
            Object obj = "Hello";
            Integer num = (Integer) obj;  // Invalid cast
        } catch (ClassCastException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.\n");
        }

        // 5. NumberFormatException
        System.out.println("=== 5. NumberFormatException ===");
        try {
            String numStr = "abc123";
            int num = Integer.parseInt(numStr);  // Cannot parse "abc123" as integer
        } catch (NumberFormatException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.\n");
        }

        // 6. StringIndexOutOfBoundsException
        System.out.println("=== 6. StringIndexOutOfBoundsException ===");
        try {
            String str = "Hello";
            char c = str.charAt(10);  // Index out of bounds
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.\n");
        }

        // 7. IllegalArgumentException (custom example)
        System.out.println("=== 7. IllegalArgumentException ===");
        try {
            throw new IllegalArgumentException("Invalid argument provided!");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.\n");
        }

        // 8. Multiple catch blocks for same try
        System.out.println("=== 8. Multiple Catch Blocks ===");
        try {
            int[] numbers = {1, 2, 3};
            int result = Integer.parseInt(numbers[5] + "");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Generic Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.\n");
        }

        // 9. Catching parent exception type
        System.out.println("=== 9. Catching Parent Exception Type ===");
        try {
            int i = 10 / 0;
        } catch (Exception e) {  // Parent class catches any exception type
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.\n");
        }

        // 10. NegativeArraySizeException
        System.out.println("=== 10. NegativeArraySizeException ===");
        try {
            int[] arr = new int[-5];  // Negative array size
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.\n");
        }

        System.out.println("Program completed successfully!");
    }
}
