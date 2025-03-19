public class NarSumRec {
  static double sum = 0;
  public static double calSum(int num) {
    if (num == 0) {
      return 0;
    } else {
      sum += num;
      calSum(num - 1);
    }
    return sum;
  }

  public static void main(String[] args) {
    int n = 5;
    System.out.println(calSum(n));
  }
}