

public class RemoveDuplicateAppend {
  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 2, 5, 6, 7, 2, 9, 10 };
    int target = 2;
    int left = 0, right = array.length-1, count = 0;
    while (left <= right) {
      if (array[left] == target) {
        array[left] = array[right];
        array[right] =0;
        count++;
        right--;
      } else {
        left++;
      }
    }
    System.out.println(array.length-count);
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}