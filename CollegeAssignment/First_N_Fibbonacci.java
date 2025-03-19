public class First_N_Fibbonacci {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int x = 0;
        int y = 1;
        int sum;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                arr[i] = x;
            } else if (i == 1) {
                arr[i] = y;
            } else {
                sum = x + y;
                arr[i] = sum;
                x = y;
                y = sum;
            }
        }

        for (int j : arr) {
            System.out.println(j);
        }
    }
}