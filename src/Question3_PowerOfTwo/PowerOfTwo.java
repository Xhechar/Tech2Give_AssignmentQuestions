package Question3_PowerOfTwo;

import java.util.Scanner;

public class PowerOfTwo {

    // Answer code to question 3: Power of two

    public static void main (String []args) {

        // initialising the scanner class for entry of values
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        // Store the integer value in a variable, in this case (myNumber)
        int myNumber = scanner.nextInt();

        int result = 0, count = 0;
        if (myNumber == 1) {
            System.out.println("True");
        }
        else if (myNumber > 1) {

            while (true) {

                count += 1;
                result = myNumber / 2;
                if (result >= 1) {

                    while (result != 1) {
                        result = result / 2;
                        count += 1;
                    }
                    if (Math.pow(2, count) == myNumber) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                }
            }
        }

    }

}
