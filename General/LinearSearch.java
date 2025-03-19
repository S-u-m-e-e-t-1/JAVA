import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                System.out.println("Element found at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}
