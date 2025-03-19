//Integer to Roman
import java.util.Scanner;

public class IntegerToRoman{
  /*public static void convertToRoman(int num){
    int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    String romanNum = "";
    for(int i = 0; i < values.length; i++){
      while(num >= values[i]){
        romanNum += roman[i];
        num -= values[i];
      }
    }
    System.out.println(romanNum);
  }*/
  public static void convertToRoman(int num){
   String []dgtTen = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
  String []dgtOne= {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    String []dgtHunndred= {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    String []dgtThousand = {"","M","MM","MMM"};
    System.out.println(num);    System.out.println(dgtThousand[num/1000]+dgtHunndred[(num%1000)/100]+dgtTen[num%100/10]+dgtOne[num%10]);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    convertToRoman(num);
}
  
}