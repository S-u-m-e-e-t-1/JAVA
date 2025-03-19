public class ContainerWithMostWater{
public static void main(String args[])
    {
int[] x={5,6,7,8,9,5,6,4,3};
float area=0;
for (int i=0; i<x.length;i++){
     for(int j=1;j<x.length; j++){
          int min = Math.min(x[i],x[j]);
          int temp = min*(j-i);
              if (area <temp) {
                  area = temp;
           }
       }
   }
System.out.println("Max water = " + area +" litres");
       }
}