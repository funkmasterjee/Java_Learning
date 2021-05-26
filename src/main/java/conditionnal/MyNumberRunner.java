package conditionnal;

public class MyNumberRunner {

    public static void main(String[] args) {

        MyNumber number = new MyNumber(8);

        boolean isPrime = number.isPrime();
        System.out.println("isPrime " + isPrime);

        int sum = number.sumUpToN();
        System.out.println("The value of sum is " + sum);

        int sumOFDivisors = number.sumOfDivisors();
        System.out.println("The value of sumOfDivisor is " + sumOFDivisors);
    }
}
