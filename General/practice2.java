import java.util.Scanner;

public class  practice2 {
    public static void main(String[] args) {
        // Problem 1
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        name = name.toLowerCase();
        System.out.println(name);

        // Problem 2
        String text = "sumeet is a bad boy";
        text = text.replace(" bad ", "good");
        System.out.println(text);

        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";

        letter = letter.replace("<|name|>", name);
        System.out.println(letter);

        // Problem 4
        String myString = "i am a   student of  gayatri college hinjilicut";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5
        String myLetter = " dear suraj  \n this is not C";
        System.out.println(myLetter);

    }
}