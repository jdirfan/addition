
import java.util.Scanner;
public class add {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number between 0 and 1000: ");
        int num = input.nextInt();

        int firstNumber = num % 10;
        int remainingNumber = num / 10;
        int secondNumber = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdNumber = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthNumber = remainingNumber % 10;
        int sum = thirdNumber + secondNumber + firstNumber + fourthNumber;
        System.out.println("The sum of all numbers in " + num + " is " + sum);

    }
}