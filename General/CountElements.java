//print number of elements present in an array

public class CountElements{
  public static void main(String []args){

    int []arr={1,6,8,9,5,6,8,9,3,4,5,7,9,0,1,2,3,4,5,6,7,8,9,0,1};

    int count=0;
    for(int i:arr){
      count++;
    }
    System.out.println("Number of elements present in array are:"+count);
  }
}