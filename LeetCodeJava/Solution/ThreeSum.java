public class ThreeSum{
  public static void main(String[] args) {
    int arr[] = { 1, 2, -3, 4, 5 };
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        for (int k = j; k < arr.length; k++) {
          if (arr[i] + arr[j] + arr[k] == 0) {
            System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
          }
        }
      }
    }
  }
}