import java.util.Scanner;

public class Wiprotraining {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Wipro Training Menu ====");
            System.out.println("1. Arithmetic Operators");
            System.out.println("2. Logical Operators");
            System.out.println("3. Increment & Decrement");
            System.out.println("4. Largest of Two (Ternary)");
            System.out.println("5. Largest of Three (Ternary)");
            System.out.println("6. Bitwise Operators");
            System.out.println("7. One's Complement");
            System.out.println("8. Swap with Temp Variable");
            System.out.println("9. Swap without Temp Variable");
            System.out.println("10. Swap using Bitwise XOR");
            System.out.println("11. Add without '+' Operator");
            System.out.println("12. Multiply by 2 without '*'");
            System.out.println("13. Divide by 2 without '/'");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> arithmeticOperators(sc);
                case 2 -> logicalOperators(sc);
                case 3 -> incrementDecrement();
                case 4 -> largestOfTwo(sc);
                case 5 -> largestOfThree(sc);
                case 6 -> bitwiseOperators(sc);
                case 7 -> onesComplement(sc);
                case 8 -> swapWithTemp(sc);
                case 9 -> swapWithoutTemp(sc);
                case 10 -> swapBitwise(sc);
                case 11 -> addWithoutPlus(sc);
                case 12 -> multiplyByTwo(sc);
                case 13 -> divideByTwo(sc);
                case 0 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        sc.close();
    }

    static void arithmeticOperators(Scanner sc) {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }

    static void logicalOperators(Scanner sc) {
        System.out.print("Enter first boolean (true/false): ");
        boolean x = sc.nextBoolean();
        System.out.print("Enter second boolean (true/false): ");
        boolean y = sc.nextBoolean();
        System.out.println("AND: " + (x && y));
        System.out.println("OR: " + (x || y));
        System.out.println("NOT x: " + (!x));
    }

    static void incrementDecrement() {
        int a = 5;
        System.out.println("Original: " + a);
        System.out.println("Post-Increment: " + (a++));
        System.out.println("After Post-Increment: " + a);
        System.out.println("Pre-Increment: " + (++a));
        System.out.println("Post-Decrement: " + (a--));
        System.out.println("After Post-Decrement: " + a);
        System.out.println("Pre-Decrement: " + (--a));
    }

    static void largestOfTwo(Scanner sc) {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        System.out.println("Largest: " + max);
    }

    static void largestOfThree(Scanner sc) {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println("Largest: " + max);
    }

    static void bitwiseOperators(Scanner sc) {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("AND: " + (a & b));
        System.out.println("OR: " + (a | b));
        System.out.println("XOR: " + (a ^ b));
        System.out.println("Left Shift a<<1: " + (a << 1));
        System.out.println("Right Shift a>>1: " + (a >> 1));
    }

    static void onesComplement(Scanner sc) {
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("One's Complement: " + (~a));
    }

    static void swapWithTemp(Scanner sc) {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    static void swapWithoutTemp(Scanner sc) {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    static void swapBitwise(Scanner sc) {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    static void addWithoutPlus(Scanner sc) {
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum: " + add(a, b));
    }

    static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }

    static void multiplyByTwo(Scanner sc) {
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int result = a << 1;
        System.out.println(a + " * 2 = " + result);
    }

    static void divideByTwo(Scanner sc) {
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int result = a >> 1;
        System.out.println(a + " / 2 = " + result);
    }
}
