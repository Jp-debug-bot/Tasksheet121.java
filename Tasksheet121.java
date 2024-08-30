import static java.lang.Math.addExact;
import static java.lang.Math.subtractExact;
import static java.lang.Math.multiplyExact;
import static java.lang.Math.floorDiv;

public class Task119 {
    
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static int divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 5;

        int sum = add(a, b);
        System.out.println("Addition of " + a + " and " + b + " = " + sum);

        int difference = subtract(a, b);
        System.out.println("Subtraction of " + b + " from " + a + " = " + difference);

        int product = multiply(a, b);
        System.out.println("Multiplication of " + a + " and " + b + " = " + product);
       
        int quotient = divide(a, b);
        System.out.println("Division of " + a + " by " + b + " = " + quotient);
    }
}

