public class PalindromeCheckerApp {
    
    // Method to check if a string is palindrome
    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for comparison
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleanStr.length() - 1;
        
        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        // UC1: Application Entry & Welcome Message
        System.out.println("========================================");
        System.out.println("  Welcome to Palindrome Checker App");
        System.out.println("========================================");
        System.out.println("This application checks if a string is a palindrome");
        System.out.println();
        
        // UC2: Hard Code Palindrome Check
        System.out.println("--- UC2: Hard Coded Palindrome Check ---");
        String[] testStrings = {"madam", "racecar", "hello", "level", "world", "noon"};
        
        for (String test : testStrings) {
            boolean result = isPalindrome(test);
            System.out.println("\"" + test + "\" is " + (result ? "a palindrome" : "not a palindrome"));
        }
        System.out.println();
    }
}
