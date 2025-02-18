public class ArithmeticDemo {
    public static void main(String[] args) {
        // Declare and Initialize Integer Variables
        int num1 = 10;
        int num2 = 5;

        // Declare and Initialize a Double Variable
        double num3 = 3.0;

        // Perform Addition
        int sum = num1 + num2;

        // Perform Subtraction
        int difference = num1 - num2;

        // Perform Multiplication
        int product = num1 * num2;

        // Perform Integer Division
        int quotient = num1 / num2;

        // Perform Modulus Operation
        int remainder = num1 % num2;

        // Demonstrate Operator Precedence
        int expressionResult = num1 + num2 * 2 - (num1 / num2);

        // Output the Results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Expression Result: " + expressionResult); // Explain order of operations
    }
}
