package Question5_ReverseInteger;

import java.util.Scanner;

public class ReverseInteger {

    // Question_5 Reverse integer

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //taking user input as integer

        System.out.print("Enter integer value:");
        int myNumber = scanner.nextInt();

        String myNumberString = String.valueOf(myNumber);

        StringBuilder reversedInteger;
        reversedInteger = new StringBuilder();

        if (myNumberString.charAt(0) == '-') {

            reversedInteger.append(myNumberString.charAt(0));
            myNumberString = myNumberString.replace(myNumberString.charAt(0), ' ').trim();

            for (int i = myNumberString.length() - 1; i >= 0; i--) {
                reversedInteger.append(myNumberString.charAt(i));

            }
        }
        else
            {
                for (int i = myNumberString.length() - 1; i >= 0; i--) {
                    reversedInteger.append(myNumberString.charAt(i));

                }
            }
        System.out.println(Integer.parseInt(String.valueOf(reversedInteger)));

    }
}
