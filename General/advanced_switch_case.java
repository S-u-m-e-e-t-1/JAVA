import java.util.Scanner;

public class advanced_switch_case  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();


        switch (name) {
            case "sumeet":
                System.out.println("HE is a non emotional guy");

                break;
            case "subham":
                System.out.println("HE is a angry guy");
                break;
            case "suraj":
                System.out.println("HE is a good artist");
                break;
            default:
                System.out.println(" you are also a good guy");
                break;
        }
        System.out.println("Thanks for using my Java Code!");


        /*
        int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced");
        }
        if(age>2){
            System.out.println("You are not a baby!");
        }
        */

    }
}