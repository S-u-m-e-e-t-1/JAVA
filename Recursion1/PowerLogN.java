public class PowerLogN {
  public static double power(int a, int b) {
    if (b == 0) {
      return 1;
    }
    if(b%2 == 0)
    return power(a,b/2)*power(a, b/2);
    else
      return a*power(a,b/2)*power(a, b/2);
  }

  public static void main(String[] args) {
    int a = 5, b = 3;
    double pow=power(a, b);
    System.out.println(pow);
  }
}