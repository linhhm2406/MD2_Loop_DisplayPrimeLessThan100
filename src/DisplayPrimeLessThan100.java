import java.util.Scanner;

public class DisplayPrimeLessThan100 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        int number = 2;
        boolean isPrime = true;

        while (number < 100) {
            isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " ");
            }
            number++;
        }
    }
}