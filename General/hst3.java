import java.util.*;
public class hst3 extends Thread{
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(6, 0.5f);
        myHashSet.add(6);
        myHashSet.add(8);
        myHashSet.add(3);
        myHashSet.add(11);

        HashSet<Integer> myHashSet1 = new HashSet<>();

        System.out.println(myHashSet.isEmpty());
        System.out.println(myHashSet1.isEmpty());


    }
}