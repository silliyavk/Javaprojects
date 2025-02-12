package pack1;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.println("\nChoose an operation:");
        System.out.println("1. Add the string to itself");
        System.out.println("2. Replace odd positions with '#'");
        System.out.println("3. Remove duplicate characters");
        System.out.println("4. Change odd characters to uppercase");
        
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        
        String result = "";
        
        if (choice == 1) {
            result = input + input;
        } else if (choice == 2) {
            result = replaceOddPositionsWithHash(input);
        } else if (choice == 3) {
            result = removeDuplicates(input);
        } else if (choice == 4) {
            result = changeOddToUpper(input);
        } else {
            result = "Invalid choice!";
        }
		
        System.out.println("\nResult: " + result);
        scanner.close();
    }
	public static String replaceOddPositionsWithHash(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i += 2) {
            chars[i] = '#';
        }
        return new String(chars);
    }
	public static String removeDuplicates(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }
        return result;
    }
	public static String changeOddToUpper(String str) {
        char[] chars = str.toCharArray();
        for (int i = 1; i < chars.length; i += 2) {
            chars[i] = Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }
}