
class NumpadCombos{
  String[] numpad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
};
  void displayCombination(int key1,int key2)
  {
    String str1 = numpad[key1];
    String str2 = numpad[key2];
    for(int i=0;i<str1.length();i++)
      {
        for(int j=0;j<str2.length();j++)
          {
            System.out.print(str1.charAt(i)+""+str2.charAt(j)+" ");
          }
      }
  }
}
public class NumpadCombination {
  public static void main(String[] args){
    NumpadCombos obj = new NumpadCombos();
    obj.displayCombination(2,3);
  }
}