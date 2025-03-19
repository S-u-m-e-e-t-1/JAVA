public class StrictSortRec {
 public static boolean isSorted(int[] a, int start){
   if(start == a.length - 1){
     return true;
   }
   if(a[start] > a[start + 1]||a[start] == a[start + 1]){
     return false;
   }
   return isSorted(a, start + 1);
 }

    public static void main(String[] args) {
        int [] a = {1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10};
      boolean b=isSorted(a,0);
      System.out.println(b);
    }
}