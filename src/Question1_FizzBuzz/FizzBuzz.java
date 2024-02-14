package Question1_FizzBuzz;

public class FizzBuzz {
    
    // Question1 FizzBuzz Solution

    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 1 && i % 5 == 1) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 3 == 1) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 1) {
                System.out.println(i + " Buzz");
            }else
                System.out.println(i);
        }
    }
}
