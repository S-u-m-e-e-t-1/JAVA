 // overloading of sum fuction to calculate sum of numbers
import java.util.Scanner;
class Sum{
  void add(int a,int b){
    System.out.println("Sum of two numbers is : "+(a+b));
  }
  void add(int a,int b,int c){
    System.out.println("Sum of three numbers is : "+(a+b+c));
  }
  void add(double a,double b){
    System.out.println("Sum of two double numbers is : "+(a+b));
  }
  void add(double a,int b){
    System.out.println("Sum of two double numbers is : "+(a+b));
  }
  void add(int a,double b){
    System.out.println("Sum of two double numbers is : "+(a+b));
  }
}


public class SumFunctionOverloading{
    public static void main(String[] args) {
        Sum s=new Sum();
      s.add(10,20);
      s.add(10,20,30);
      s.add(10.5,20.5);
      s.add(10.5,20);
      s.add(10,20.5);
      }
}