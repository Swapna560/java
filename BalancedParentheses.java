import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an expression with parentheses:");
        String expression = scanner.nextLine();
        
        if (isBalanced(expression)) {
            System.out.println("The parentheses are balanced.");
        } else {
            System.out.println("The parentheses are not balanced.");
        }
        
        scanner.close();
    }

    public static boolean isBalanced(String expression) {
        char[] stack = new char[expression.length()];
        int top = -1;

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack[++top] = currentChar;
            } else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                if (top == -1) {
                    return false;
                }
                char poppedChar = stack[top--];
                if (currentChar == ')' && poppedChar != '(') {
                    return false;
                } else if (currentChar == '}' && poppedChar != '{') {
                    return false;
                } else if (currentChar == ']' && poppedChar != '[') {
                    return false;
                }
            }
        }
        return top == -1;
    }
}
