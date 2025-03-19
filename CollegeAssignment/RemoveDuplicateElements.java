//print duplicate elements in an array
import java.util.Scanner;
public class RemoveDuplicateElements{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.of elements");
    int dupElmntPos;
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter elements in Array");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]==arr[j]){
          arr[j]=-1;
        }
      }
    }
    for(int i=0;i<n;i++){
      if(arr[i]==-1){
        dupElmntPos=i;
        n--;
        for(int j=dupElmntPos;j<n;j++){
          arr[j]=arr[j+1];
        }
      }
    }
    System.out.println("After removal of Duplicate elements in Array");
    for(int i=0;i<n;i++){
      System.out.print("["+arr[i]+"]");
    }
  }
}