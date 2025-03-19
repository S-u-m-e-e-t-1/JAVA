
import java.util.Scanner;
public class NumberGuessGame {
    public static void main(String[] args) {
        int num= (int)(Math.random()*100),guess = 0;
        int attempts=0;
        boolean flag=true;
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number to match OR -1 to quit");
        while (flag){
           guess=sc.nextInt();
            if(guess==num){
                System.out.println("you got it!");
                System.out.println("the number is"+num);
                flag=false;

            }else if(guess==-1){
                System.out.println("you cant resist");
                System.out.println("the number is"+num);
                flag=false;

            }
            else if (guess<num) {
                System.out.println("make it big");
                attempts++;
            }else {
                System.out.println("get down low");
                attempts++;
            }
        }

    }
}
