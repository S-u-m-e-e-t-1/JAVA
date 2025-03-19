 public class GenerateParentheses {

    private static void generateParentheses(int n) {
        generateParentheses("", 0, 0, n);
    }

    private static void generateParentheses(String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            System.out.println(current);
            return;
        }

        if (open < max) {
            generateParentheses(current + "(", open + 1, close, max);
        }
        if (close < open) {
            generateParentheses(current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        generateParentheses(n);
    }
 }