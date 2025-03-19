import java.util.Scanner;
public class MagicNumber{
    public static void main(String[] args){
      int n,n1;
      int sum = 0;
    Scanner input = new Scanner(System.in);
     System.out.print("Enter a number: ");
      n = input.nextInt();
      n1=n;
      while(n>0||sum>9)
      {
        if(n==0){
          n=sum;
          sum=0;
        }
        sum+=n%10;
        n/=10;
      }
      if(sum==1)
      System.out.println("The number is magic number"+n1);
    }
}