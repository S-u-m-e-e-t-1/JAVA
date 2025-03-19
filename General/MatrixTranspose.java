import java.util.Scanner;

public class MatrixTranspose{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int r = sc.nextInt();
        System.out.println("Enter no. of columns");
        int c = sc.nextInt();
        int i, j;
        int a[][] = new int[r][c];
        int b[][] = new int[c][r];
        System.out.println("Enter elements in Array");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                b[j][i] = a[i][j];
            }
        }


        System.out.println("Transpose of Matrix:");
        for (i = 0; i < c; i++) {
            for (j = 0; j < r; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}