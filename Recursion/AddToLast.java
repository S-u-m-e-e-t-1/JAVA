public class AddToLast {
 public static String addToLast(String org, String newStr, String newStr2,char tar,int idx){
   if(idx==org.length()){
     return newStr+newStr2;
   }
   if(org.charAt(idx)==tar){
return addToLast(org,newStr,newStr2+tar,tar,idx+1);
   }else{
     return addToLast(org,newStr+org.charAt(idx),newStr2,tar,idx+1);
   }
 }

    public static void main(String[] args) {
        String org = "axxbxxcde";
        String newStr = "";
        String newStr2 = "";
        char tar='x';
        System.out.println(addToLast(org, newStr,newStr2,tar,0));
    }
}