//sort elemnts of an array using bubble sort
import java.util.Scanner;
public class AscendingBubbleSort{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.of elements");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter elements in Array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
  System.out.println("Elements in Array before sorting");
    for(int i=0;i<n;i++){
      System.out.print("["+arr[i]+"]");
    }
    System.out.println();
    for(int i=0;i<n;i++){
      for(int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    System.out.println("Elements in Array after sorting");
    for(int i=0;i<n;i++){
      System.out.print("["+arr[i]+"]");
    }
  }
}