package Question4_CapitalizeWords;

import java.util.Scanner;

public class CapitalizeWords {

    public static void main(String[] args) {

        //Question4 Capitalize words

        //Initialize scanner class to store the message in variable (message)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your message:");
        //stores the message entered and removes extra space to avoid invalid output
        String message = scanner.nextLine().trim();

        //store the first character in final message as UpperCase
        StringBuilder finalMessage;
        finalMessage = new StringBuilder(Character.toUpperCase(message.charAt(0)) + "");

        for (int i = 1; i < message.length(); i++) {

            //Store each character in message to a variable
            char character = message.charAt(i);

            if (character == ' ') {
                finalMessage.append(message.charAt(i));
                message = message.replace(message.charAt(i+1), Character.toUpperCase(message.charAt(i+1)));
                continue;
            }
            finalMessage.append(character);
        }

        System.out.println(finalMessage);

    }
}