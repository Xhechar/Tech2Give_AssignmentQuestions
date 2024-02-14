package Question6_CountVowels;

import java.util.Scanner;

public class CountVowels {

    //Question6 Counting Vowels

    public static void main(String[] args) {

        final String vowels = "aeiou";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your message:");
        String message = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < message.length(); i++) {

            char character = message.charAt(i);

            for (int j = 0; j < vowels.length(); j++) {
                if (vowels.charAt(j) == character)
                    count += 1;
            }

        }
        System.out.println(count);
    }

}
