import java.util.Scanner;

public class BillingSystem {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of calls: ");
    int calls = sc.nextInt();
    double bill = 100.0;
    if (calls > 0 && calls <= 100)
      bill = calls * 1.10;
    else if (calls > 100 && calls <= 250)
      bill = 100 * 1.10 + (calls - 100) * 1.50;
    else
      bill = 100 * 1.10 + 150 * 1.50 + (calls - 250) * 3.00;
    System.out.println("The bill is: " + bill);
  }

}