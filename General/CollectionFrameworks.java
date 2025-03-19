import java.util.*;
import java.time.*;
public class CollectionFrameworks {
   public static void main(String[] args) {
//    LinkedList<String> strList=new LinkedList<String>();
//    strList.add("sumeet");
//    strList.add("suraj");
//    strList.add("sabat");
//    strList.add("tripathy");
//    strList.addFirst("balaji");
//    strList.addLast("sameer");
//    strList.add("nigam");
//    strList.add("bikram");
//    strList.add("rudra");
//    System.out.println(strList.getFirst());
//    System.out.println(strList.getLast());
//    List<String> s2=new ArrayList<>();
//    s2.add("jaganath");
//    s2.add("uddhav");
//    strList.addAll(1,s2);
//    Collections.sort(strList,Collections.reverseOrder());
//    System.out.println(strList);
//
//

       HashMap<Integer, String> s = new HashMap<>();
       s.put(1,"Krushna");
       s.put(2,"Kanha");
       s.put(3,"Subha");
       s.put(4,"Raja");
       s.put(5,"Chinmaya");
       s.put(6,"Sonali");
       System.out.println(s.getOrDefault(2,"s"));
       LocalDate s1= LocalDate.now();
       LocalTime t1=LocalTime.now();
       System.out.println(s1+" "+t1);


   }
}

