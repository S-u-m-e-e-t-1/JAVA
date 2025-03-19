// Sum of elements in a row of matrix 
import java.util.Scanner;
public class SumOfRowColumn{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter dimensions of matrix");
    int m = sc.nextInt();
    int n = sc.nextInt();
    int[][] matrix = new int[m][n];
    System.out.println("Enter elements  of matrix");
    for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
        matrix[i][j] = sc.nextInt();
      }
    }
  for(int i=0;i<m;i++){
      int sumRow = 0;
      for(int j=0;j<n;j++){
        sumRow += matrix[i][j];
        System.out.print(matrix[i][j]+"\t");
      }
      System.out.println("Sum = "+sumRow);
    }
    for(int j=0;j<n;j++){
    	int sumColumn=0;
    	for(int i=0;i<m;i++){
    		sumColumn+=matrix[i][j];
    		}
    		System.out.println("Sum of "+(j+1)+"th column="+sumColumn);
    	}

  }
}