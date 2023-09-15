package CoditionalExercise;
import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Give the first number: ");
//        int num1 = scanner.nextInt();
//        System.out.println("Give the second number: ");
//        int num2 = scanner.nextInt();
//        if (num1 > num2){
//            System.out.println(num1 + "is bigger");
//        } else {
//            System.out.println(num2 + "is bigger");
//        }
//
//        System.out.println("Give another number: ");
//        int anotherNum = scanner.nextInt();
//        if (anotherNum % 2 == 0){
//            System.out.println("It is an even number");
//        } else {
//            System.out.println("It is an odd number");
//        }

//        System.out.println("Give a traffic light colour, red or green?");
//        String trafficLight = scanner.nextLine();
//        if (trafficLight.equals("red")){
//            System.out.println("red means stop");
//        } else if (trafficLight.equals("green")){
//            System.out.println("green means go");
//        } else {
//            System.out.println("wrong colour given");
//        }
        System.out.println("Give a number between 1 to 12");
        int month = scanner.nextInt();
        switch(month){
            case 12:
            case 1:
            case 2:
                System.out.println("It is winter.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It is spring.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It is summer.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It is winter.");
                break;
            default:
                System.out.println("Wrong number given");

        }


    }
}
