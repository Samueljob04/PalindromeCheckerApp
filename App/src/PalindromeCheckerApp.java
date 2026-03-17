import java.util.Scanner;
import java.util.Stack;

public class PalindromeStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase (optional for case-insensitive check)
        input = input.toLowerCase();

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop from stack and compare
        for (int i = 0; i < input.length(); i++) {
            char ch = stack.pop();
            if (input.charAt(i) != ch) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }

        sc.close();
    }
}
