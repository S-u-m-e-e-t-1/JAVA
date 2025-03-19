public class FactRec{
  static double fact= 1;
  public static double calFact(int num){
    if(num==0){
      return 1;
    }else{
      fact *= num;
      calFact(num-1);
    }
    return fact;
  }
  public static void main(String[] args) {
    int n = 5;
    System.out.println(calFact(n));
  }
}