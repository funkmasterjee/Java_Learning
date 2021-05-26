package conditionnal;

public class SwitchExercice {

    public static boolean isWeekDay(int dayNumber) {
        switch (dayNumber) {
                case 0: //Sunday
                System.out.println("This is not a week day");break;
                case 1: //Monday
                System.out.println("This is a week day");break;
                case 2: // Tuesday
                System.out.println("This is a week day");break;
                case 3: // Wednesday
                System.out.println("This is a week day");break;
                case 4 : //Thursday
                System.out.println("This is a week day");break;
                case 5: // Friday
                System.out.println("This is a week day");break;
                case 6: // Saturday
                System.out.println("This is not a week day"); break;
                default:
                System.out.println("Error");
        }
        return true;
    }

    public static String determineNameOfMonth(int monthNumber){

        String NameOfMonth;

        switch (monthNumber) {
            case 1:
                System.out.println("This is January");
                NameOfMonth = "January";
                break;
            case 2:
                System.out.println("This is February");
                NameOfMonth = "February";
                break;
            case 3:
                System.out.println("This is March");
                NameOfMonth = "March";
                break;
            case 4:
                System.out.println("This is April");
                NameOfMonth = "April";
                break;
            case 5:
                System.out.println("This is May");
                NameOfMonth = "May";
                break;
            case 6:
                System.out.println("This is June");
                NameOfMonth = "June";
                break;
            case 7:
                System.out.println("This is July");
                NameOfMonth = "July";
                break;
            case 8:
                System.out.println("This is August");
                NameOfMonth = "August";
                break;
            case 9:
                System.out.println("September");
                NameOfMonth = "September";
                break;
            case 10:
                System.out.println("This is October");
                NameOfMonth = "October";
                break;
            case 11:
                System.out.println("This is November");
                NameOfMonth = "November";
                break;
            case 12:
                System.out.println("This is December");
                NameOfMonth = "December";
                break;
            default:
                System.out.print("Invalid Number");
                NameOfMonth = "Invalid Number";
        }
        return NameOfMonth;
    }

    public static String determineNameOfDay(int dayNumber){
        
        String nameOfDay = null;
        //If I use "return" in the method, then the we exit the method, so a break is not needed.
        switch (dayNumber){
            case 0: nameOfDay = "Sunday"; break;
            case 1: nameOfDay = "Monday"; break;
            case 2: nameOfDay = "Tuesday"; break;
            case 3: nameOfDay = "Wednesday"; break;
            case 4: nameOfDay = "Thursday";break;
            case 5: nameOfDay = "Friday";break;
            case 6: nameOfDay = "Saturday";break;
            default : {
            System.out.println("Error");    
            }

        }
        System.out.println("This is " + nameOfDay);
        
    return nameOfDay;

    }
}
