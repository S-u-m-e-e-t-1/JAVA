public class practice6{
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1_rec(int n) {
        if (n > 0) {
            pattern1_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sumRec(int n) {

        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }

    static void fib(int n) {
         int x=0;
         int y=1;
         int sum=0;
        System.out.print(x+","+y);
         while(sum<n)
         {
             sum=x+y;
             x=y;
             y=sum;
             System.out.print(","+sum);
         }
    }

    public static void main(String[] args) {
        // Problem 1
//         multiplication(7);

        // Problem 2
        // pattern1(9);

        // Problem 3
//         int c = sumRec(4);
//         System.out.println(c);

        // Problem 4

         fib(7);


        // Problem 8
//        pattern1(9);

    }
}