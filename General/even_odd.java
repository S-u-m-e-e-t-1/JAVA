import java.util.Scanner;
public class even_odd {
    public static void main(String[] args)
    {
        System.out.println("enter a number to check");
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0)
            System.out.println("it is aeven number");
        else
            System.out.println(" it is aodd number");


    }

}
