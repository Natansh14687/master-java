
import java.util.Scanner;

class Calculator {

    public static void add() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int num1 = scan.nextInt();
        System.out.println("Enter the 2nd number : ");
        int num2 = scan.nextInt();

        if (num1 > 0 && num2 < 100) {
            int res = num1 + num2;
            System.out.println("Addition of num1 and num2 is : " + res);
        } else {
            System.err.println("Invalid Input");
        }
    }
}

public class Addition {

    public static void main(String[] args) {
        Calculator.add();
    }
}
