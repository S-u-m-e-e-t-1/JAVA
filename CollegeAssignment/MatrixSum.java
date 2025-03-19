//add two matrix
import java.util.Scanner;
public class MatrixSum{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no.of rows");
    int r=sc.nextInt();
    System.out.println("Enter no.of columns");
    int c=sc.nextInt();
    int a[][]=new int[r][c];
    int b[][]=new int[r][c];
    int sum[][]=new int[r][c];
    System.out.println("Enter elements in Array a");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        a[i][j]=sc.nextInt();
      }
    }
    System.out.println("Enter elements in Array b");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        b[i][j]=sc.nextInt();
      }
    }
    System.out.println("Sum of two matrix");
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        sum[i][j]=a[i][j]+b[i][j];
        System.out.print("["+sum[i][j]+"]");
      }
      System.out.println();
    }
  }
}