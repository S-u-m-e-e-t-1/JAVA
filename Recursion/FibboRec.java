public class FibboRec {
  public static void getFibbo(int a, int b, int n) {
    if (n == 0) {
      return;
    }
    int c = a + b;
    System.out.print(" " + c);
    getFibbo(b, c, n - 1);
  }

  public static void main(String[] args) {
    int a = 0, b = 1, n = 5;
    System.out.print(a + " " + b);
    getFibbo(a, b, n);

  }
}