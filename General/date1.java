//import java.time.*;
//public class date1 extends Thread{
//    public static void main(String[] args) {
//        LocalDate d = LocalDate.parse("2021-05-27");
//        System.out.println(d.withYear(2001));
//
// }
//}
//import java.time.*;
//public class date1 extends Thread{
//    public static void main(String[] args) {
//        LocalTime t = LocalTime.now();
//        System.out.println(t);
//
//    }
//}
//import java.time.*;
//public class date1 extends Thread{
//    public static void main(String[] args) {
//        LocalTime t = LocalTime.of(13,18,29);
//        System.out.println("Time before : "  + t);
//
//        LocalTime t1= t.plusHours(5);
//        System.out.println("Time after adding 5 hours : " + t1);
//
//    }
//}
//import java.time.*;
//public class date1 extends Thread{
//    public static void main(String[] args) {
//        LocalTime t = LocalTime.of(15,28,19);
//        System.out.println("Time before : "  + t);
//
//        LocalTime t1= t.minusMinutes(8);
//        System.out.println("Time after subtracting 8 minutes : " + t1);
//
//    }
//}
import java.time.*;
public class date1 extends Thread{
    public static void main(String[] args) {
        Clock cl = Clock.systemDefaultZone();
        System.out.println(cl.getZone());
    }
}