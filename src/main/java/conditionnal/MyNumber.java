package conditionnal;

public class MyNumber {


    private final int number;

    public MyNumber(int number) {
        this.number = number;
        System.out.println("int is equal to " + this.number);
    }

    public boolean isPrime() {

        if (number < 2) { //guard check - tous les cas ou la method sera en erreur
            return false;
        }
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumUpToN() {

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public int sumOfDivisors(){
        //if number is 6, sum of divisor = 2+3 = 5
        //not 1 or 6
        int sumOfDivisors = 0;

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                sumOfDivisors = i + i;
                //return sumOfDivisors;
            }
        }
        return sumOfDivisors;
    }

}
/*    public static boolean isPrime(int i) {
        System.out.println("isPrime is equal to " + i);

        int j;

        for (j = 2; j<= i; j++) {
            if  ((i % 1) == 0 & (i % j) == 0) {
                    System.out.println("This is a prime number");
            } else {
                System.out.println("This is not a prime number");
            }
        }
        //System.out.println("This is a prime number");
        return false;*/


