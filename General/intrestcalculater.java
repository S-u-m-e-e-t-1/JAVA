
import java.util.Scanner;

public class intrestcalculater {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int p=sc.nextInt();
        int t=sc.nextInt();
        int r=sc.nextInt();
        int si=(p*t*r)/100;
        System.out.println("simple interest="+si);
    }
}
