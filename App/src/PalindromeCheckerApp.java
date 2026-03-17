import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeQueueStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase (optional)
        input = input.toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Insert characters into both stack and queue
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue (queue) with pop (stack)
        while (!stack.isEmpty() && !queue.isEmpty()) {
            char fromStack = stack.pop();     // Last character
            char fromQueue = queue.remove();  // First character

            if (fromStack != fromQueue) {
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