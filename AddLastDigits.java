package day2;

public class AddLastDigits {
     public static int addLastDigits(int input1, int input2) {
        int lastDigit1 = Math.abs(input1) % 10;
        int lastDigit2 = Math.abs(input2) % 10;

        return lastDigit1 + lastDigit2;
    }

    public static void main(String[] args) {
        System.out.println("Sum of last digits: " + addLastDigits(265, 154));    
        System.out.println("Sum of last digits: " + addLastDigits(26787, -154));   
        System.out.println("Sum of last digits: " + addLastDigits(-267, 120));   
        System.out.println("Sum of last digits: " + addLastDigits(-267, -1745));  
    }
    
}
