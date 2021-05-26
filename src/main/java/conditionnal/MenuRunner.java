package conditionnal;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class MenuRunner {
    public static void main(String[] args) {
        // pour enregistrer de l'info du user
        //type obj = new Type(argument)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("The number 1 your entered is - " + number1);
        System.out.println("Enter number 2: ");
        int number2 = scanner.nextInt();
        System.out.println("The number 2 your entered is - " + number2);

        System.out.println("Please choose one of the following operation that you would like to perform: \n 1-Add \n 2-Substract \n 3-Divide \n 4-Multiply ");
        int choice = scanner.nextInt();
// in a switch, all the case below the one that is true will be executed.
        //Il faut ajouter un "break"

        performOperationUsingIfElse(number1, number2, choice);

    }

    private static void performOperationUsingIfElse(int number1, int number2, int choice) {
        switch(choice) {
            case 1 : System.out.println("The sum of the 2 numbers is " + (number1 + number2)); break;
            case 2 : System.out.println("The substraction of the 2 numbers is " + (number1 - number2)); break;
            case 3 : System.out.println("The division of the 2 numbers is " + (number1 / number2)); break;
            case 4 : System.out.println("The multiplication of the 2 numbers is " + (number1 * number2)); break;
            default: System.out.println("Invalid choice");break;
        }

        //le code plus bas fait la meme chose que le switch
        //if (choice == 1){
            //System.out.println("The sum of the 2 numbers is " + (number1 + number2));
        //} else if (choice == 2){
       // System.out.println("The substraction of the 2 numbers is " + (number1 - number2));
       // } else if (choice == 3){
           // System.out.println("The division of the 2 numbers is " + (number1 / number2));
        //} else if (choice == 4){
            //System.out.println("The multiplication of the 2 numbers is " + (number1 * number2));
        //} else {
           // System.out.println("Invalid choice");
        //}
    }
}
