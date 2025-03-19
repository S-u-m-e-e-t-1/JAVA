public class ThreeSumClosest{
  public static void main(String[] args) {
    int arr[] = {1, 2, 4, 5};
    int close = Integer.MAX_VALUE; 
    int target = 1;
    int closestSum = 0;

    for (int i = 0; i < arr.length - 2; i++) {
      for (int j = i + 1; j < arr.length - 1; j++) {
        for (int k = j + 1; k < arr.length; k++) {
          int sum = arr[i] + arr[j] + arr[k];
          int temp = Math.abs(sum - target);
          if (temp < close) {
            close = temp;
            closestSum = sum;
          }
        }
      }
    }
    System.out.println(closestSum);
  }
}