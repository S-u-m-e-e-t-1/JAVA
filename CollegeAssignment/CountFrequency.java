import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[100];
        int[] b = new int[100];
        int n, i, j, C = 0;

        System.out.println("Enter size: ");
        n = scanner.nextInt();

        System.out.println("Enter elements: ");
        for (i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (i = 0; i < n; i++) {
            C = 1;

            for (j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    C++;
                    a[j] = -1;
                }
            }
            b[i] = C;
        }

        System.out.println("Occurrences: ");
        for (i = 0; i < n; i++) {
            if (a[i] != -1) {
                System.out.println(a[i] + " occurs " + b[i]);
            }
        }
    }
}