package day2;

public class PowerCalc {
     public static void main(String[] args) {
        double num1 = 3.5;
        int num2 = 2;

        double result = Calculator.powerDouble(num1, num2);
        System.out.println(num1 + " raised to the power " + num2 + " is: " + result);
    }
}

class Calculator {

    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

	public static int powerInt(int num1, int num2) {
		return 0;
	}
}
