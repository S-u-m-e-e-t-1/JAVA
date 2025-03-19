import java.util.Scanner;
public class sringmethodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        // System.out.println(name);
        int value = name.length();
        //System.out.println(value);

        //String lstring = name.toLowerCase();
        //System.out.println(lstring);

        //String ustring = name.toUpperCase();
        //System.out.println(ustring);

        //String nonTrimmedString = "     suraj    ";
        //System.out.println(nonTrimmedString);

        //String trimmedString = nonTrimmedString.trim();
        //System.out.println(trimmedString);

        //System.out.println(name.substring(1));
        //System.out.println(name.substring(1,5));

        //System.out.println(name.replace('r', 'p'));
        //System.out.println(name.replace("r", "b"));

        //System.out.println(name.startsWith("Har"));
        //System.out.println(name.endsWith("dd"));

        //System.out.println(name.charAt(4));

        //String modifiedName = "SUmeeteetetete";
        //System.out.println(modifiedName.indexOf("et"));
        //System.out.println(modifiedName.indexOf("sum", 4));
        //System.out.println(modifiedName.lastIndexOf("ete", 7));

        //System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("sumeet"));

        System.out.println("I am escape sequence\tdouble quote");
    }
}
