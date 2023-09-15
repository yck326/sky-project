package variableexercises;

import java.util.Scanner;

public class StringVariables {

    public static void main(String[] args) {
//        String firstName = "Yuk";
//        String lastName = "Chen";
//        String name = firstName+lastName;
//
//        System.out.println(name);

//        int num1 = 9, num2 = 3;
//        System.out.println(num1+num2);
//        int result = num1/num2;
//        int num3 = 8;
//        System.out.println(num3++);
//        System.out.println(num3);
//        System.out.println(++num3);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Hello " + firstName + lastName);

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = num1+num2;
        System.out.println("The sum is: "+ sum);



    }
}
