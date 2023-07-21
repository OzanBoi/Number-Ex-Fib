import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(getPentagonalNumber(2));
        System.out.println(sumDigits(723));
        System.out.println(isPalindrome(121));
        displaySortedNumbers(123, 3939, 0);
        randomSum();
        fib(5);
        isPrime(5);
        System.out.println(middle("12345"));
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;

        }
        return sum;
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed *= 10;
            reversed += number % 10;
            number /= 10;
        }
        return reversed;

    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double max = Math.max(Math.max(num1, num2), Math.max(num1, num3));
        double min = Math.min(Math.min(num1, num2), Math.min(num1, num3));
        double middle = (num1 + num2 + num3) - (max + min);
        System.out.printf("%2f %2f %2f\n", min, middle, max);
    }

    public static void randomSum() {
        Random rnd = new Random();
        int a = rnd.nextInt(1, 7);
        int b = rnd.nextInt(1, 7);
        System.out.println("Sum: " + a + " " + b);
    }

    public static void fib(int n) {
        int counter = 0, a = 0, b = 1;
        while (counter != n) {
            System.out.println(a);
            int temp = a;
            a = b;
            b += temp;

            counter++;

        }
    }

    public static void primeCounter(int number) {
        int counter = 0;

        for (int i = 0; i < number; i++) {
            if (isPrime(i)) {
                System.out.printf("%d number is prime\n", i);
                counter++;
            }
        }
        System.out.printf("We have %d prime numbers from 0 to %d\n", counter, number );
    }
    public static boolean isPrime(int number){
        if (number < 2)
            return false;

        for (int i = 2; i < number / 2 + 1;i++){
            if(number % i == 0){
                return false;
            }

        }
        return true;
    }
    public static String middle(String str){
        int start =str.length() / 2;
        int end = 1;

        if(str.length() % 2 == 0) {
            end = 2;
            start--;
        }
        return str.substring(start, start + end);
    }
    public static  double method(double a, double b){
        return a*b;
    }
    public static  int method(int a, int b){
        return a+b;
} }