public class FindOccurence {
  static int foc = -1;
  static int  loc = -1;
  public static void find(String a,int b,char c) {
    if(b == a.length()){
      if(foc == -1 && loc == -1){
        System.out.println("Not Found");
      }
      else{
        System.out.println("First Occurence: "+foc);
        System.out.println("Last Occurence: "+loc);
      }
      return;
    }
    if(a.charAt(b)==c){
      if(foc==-1){
        foc = b;
      }
      else{
        loc = b;
      }
    }
    find(a,b+1,c);
  }

  public static void main(String[] args) {
    String str = "Helloeekierg";
    
    find(str,0,'e');

  }
}