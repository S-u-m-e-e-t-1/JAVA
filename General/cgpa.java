import java.util.Scanner;

public class cgpa {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Physics marks : ");
        int physics = scan.nextInt();
        System.out.println("Enter your English marks : ");
        int English = scan.nextInt();
        System.out.println("Enter your Chemistry marks : ");
        int chemistry = scan.nextInt();
        System.out.println("Enter your Mathematics marks : ");
        int mathematics = scan.nextInt();
        System.out.println("Enter your biology marks : ");
        int biology = scan.nextInt();
        System.out.println("Enter your Odia marks : ");
        int odia = scan.nextInt();

        float percentage = ((physics + English + chemistry + biology+odia)/500.0f)*100;

        System.out.println("percentage : ");
        System.out.println(percentage);


    }
}