import java.lang.Math;
import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
        int num = input.nextInt();
      int reminder ,tep ;
      tep= num;
      double sum = 0;
        while(num > 0){
          reminder = num % 10;
          sum = sum + Math.pow(reminder,3);
          num = num / 10;
        }
      if(sum == tep){
        System.out.println("Armstrong number");
      }
      else{
        System.out.println("Not an Armstrong number");
      }
    }
}