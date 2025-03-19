//sum of elements in an Array
import java.util.Scanner;
public class SumOfElements{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.of elements");
    int n=sc.nextInt();
    int []arr=new int[n];
    System.out.println("Enter elements in Array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int sum=0;
    for(int i=0;i<n;i++){
      sum=sum+arr[i];
    }
    System.out.println("Sum of elements in Array is:"+sum);
  }
}