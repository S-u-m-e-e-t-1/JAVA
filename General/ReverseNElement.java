
import java.util.Scanner;

public class ReverseNElement{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int [] array= {1,2,3,4,5,6,7,8,9,10};
     int n = sc.nextInt();
for(int i = 0; i < array.length; i+=n){
  int left = i;
  int right = i+n - 1;
        while (left < right&& right<=array.length) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
  
}
     for(int i = 0; i < array.length; i++){
       System.out.print(array[i] + " ");
     }
 }
}