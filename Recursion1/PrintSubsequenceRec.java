public class PrintSubsequenceRec {
    public static void printSubsequence(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
      
        printSubsequence(str, idx+1, newString);
      
        printSubsequence(str, idx+1, newString+str.charAt(idx));
    }

    public static void main(String[] args) {
        String org = "abc";
        printSubsequence(org, 0, "");
        
    }
}