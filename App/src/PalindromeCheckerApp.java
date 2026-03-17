import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Stack Strategy (UC5 logic)
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        input = input.toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Deque Strategy (UC7 logic)
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        input = input.toLowerCase();
        Deque<Character> deque = new LinkedList<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Context Class (uses strategy)
class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.check(input);
    }
}

// Main Class
public class PalindromeApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PalindromeContext context = new PalindromeContext();

        System.out.println("Choose method:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");

        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Inject strategy dynamically
        if (choice == 1) {
            context.setStrategy(new StackStrategy());
        } else {
            context.setStrategy(new DequeStrategy());
        }

        boolean result = context.execute(input);

        if (result) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }

        sc.close();
    }
}