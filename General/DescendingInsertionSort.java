// sort elements of an array in descnding order using insertion sort
import java.util.Scanner;
public class DescendingInsertionSort{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.of elements");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter elements in Array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for (int i = 1; i < n; ++i) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] < key) {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
    System.out.println("Sorted Array");
    for(int i=0;i<n;i++){
      System.out.print("["+arr[i]+"]");
    }
  }
}