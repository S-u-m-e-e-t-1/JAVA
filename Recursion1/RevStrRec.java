public class RevStrRec {
  public static void reverseString(String a) {
    if (a.length() == 0) {
      return;
    }
    System.out.print(a.charAt(a.length() - 1));
    reverseString(a.substring(0, a.length() - 1));
  }

  public static void main(String[] args) {
    String str = "Hello";
    reverseString(str);

  }
}