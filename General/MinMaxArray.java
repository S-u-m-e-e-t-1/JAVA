//find the smallest and greatest number in Array
import java.util.Scanner;
public class MinMaxArray{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int max=arr[0];
    int min=arr[0];
    for(int i=0;i<n;i++){
      if(arr[i]>max){
        max=arr[i];
      }
      if(arr[i]<min){
        min=arr[i];
      }
    }
    System.out.println("Maximum number is:"+max);
    System.out.println("Minimum number is:"+min);
  }
}