
import java.util.Scanner;
 public class EvenPosition{
   public static void main(String []args){
     //print elements on even position in an array
     Scanner sc=new Scanner(System.in);
     int n= sc.nextInt();
     int []arr=new int[n];
     System.out.println("Enter elements in Array");
     for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
     }
     System.out.println("Elements on even position are:");
     for(int i=0;i<n;i++){
       if(i%2==0){
         System.out.println(arr[i]);
       }
     }
   }
 }
