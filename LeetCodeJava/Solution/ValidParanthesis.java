import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    String name = "(})";
    boolean isBalanced = true;
    List<Character> list = new ArrayList<>();
    for (char i : name.toCharArray()) {
      if (i == '(' || i == '{' || i == '[') {
        list.add(i);
        System.out.println("added" + i);
      }
      if (i == ')' && list.get(list.size() - 1) != '(') {
        isBalanced = false;
        break;
      }
      if (i == '}' && list.get(list.size() - 1) != '{') {
        isBalanced = false;
        break;
      }
      if (i == ']' && list.get(list.size() - 1) != '[') {
        isBalanced = false;
        break;
      }

    }
    if (isBalanced) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }
  }
}