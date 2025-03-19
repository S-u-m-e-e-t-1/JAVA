//copy elements of an array to another array
import java.util.Scanner;
public class CopyArray{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.of elements");
    int n=sc.nextInt();
    int src[]=new int[n];
    System.out.println("Enter elements in Array");
    for(int i=0;i<n;i++){
      src[i]=sc.nextInt();
    }
    int dest[]=new int[n];
    for(int i=0;i<n;i++){
      dest[i]=src[i];
    }
    System.out.print("src :");
  System.out.print("\t\t\t\t");
    System.out.println("dest :");
    for(int i=0;i<n;i++){
      System.out.print(src[i]);
      System.out.print("\t\t\t\t");
      System.out.print(dest[i]);
      System.out.println();
    }


  }
}
