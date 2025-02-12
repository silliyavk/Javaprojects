package pack1;

public class CheckNumber {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);

            if (number > 0) {
                System.out.println(number + " is a positive number.");
            } else if (number < 0) {
                System.out.println(number + " is a negative number.");
            } else {
                System.out.println(number + " is zero.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
