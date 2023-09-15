package Calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Say the first number");
        int num1 = scanner.nextInt();
        System.out.println("Say the second number");
        int num2 = scanner.nextInt();

        double result = 0.0;
        System.out.println("Give the operator: + or - or * or /");
        char operator = scanner.next().charAt(0);
        switch(operator){
            case('+'):
                result = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + (int)result);
                break;
            case('-'):
                result = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + (int)result);
                break;
            case('*'):
                result = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + (int)result);
                break;
            case('/'):
                result = (double)num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + result);
                break;
            default:
                System.out.println("You typed in the wrong operator");
        }
    }
}
