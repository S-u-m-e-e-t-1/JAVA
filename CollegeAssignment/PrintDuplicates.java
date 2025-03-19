//print duplicate elements in an array
import java.util.Scanner;
public class PrintDuplicates{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.of elements");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter elements in Array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Duplicate elements in Array");
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]==arr[j]){
          System.out.println(arr[i]);
        }
      }
    }
  }
}