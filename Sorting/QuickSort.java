 public class QuickSort{
   public static int[] quickSort(int[] arr, int low, int high){
     if(low < high){
       int pi = partition(arr, low, high);
       quickSort(arr, low, pi-1);
       quickSort(arr, pi+1, high);
       
     }
     return arr;
   }
   public static int partition(int[] arr, int low, int high){
     int pivot = arr[high];
     int i = (low-1);
     for(int j = low; j <= high-1; j++){
       if(arr[j] < pivot){
         i++;
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
       }
     }
     int temp = arr[i+1];
     arr[i+1] = arr[high];
     arr[high] = temp;
     return i+1;
   }
   public static void main(String[] args){
     int arr[] = {1,5,63,24,89,90,45,23,12,10};
     int n = arr.length;
     int [] arr2=quickSort(arr,0,n-1);
     for(int i = 0; i < n; i++){
       System.out.println(arr2[i]);
     }
   }
 }