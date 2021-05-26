package conditionnal;

import java.util.Scanner;

public class SwitchExerciceRunner {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please choose one of the following number corresponding to a day in the week: \n 0-Sunday \n 1-Monday\n 2-Tuesday \n 3-Wednesday \n 4-Thursday \n 5-Friday \n 6-Saturday");
            int dayNumber = scanner.nextInt();
            SwitchExercice.isWeekDay(dayNumber);


            System.out.println("Please enter a number from 1 to 12");
            int monthNumber = scanner.nextInt();
            SwitchExercice.determineNameOfMonth(monthNumber);

            System.out.println("Please enter a number from 1 to 7");
            dayNumber = scanner.nextInt();
            SwitchExercice.determineNameOfDay(dayNumber);

    }
}
