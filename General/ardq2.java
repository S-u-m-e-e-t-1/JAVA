import java.util.*;
public class ardq2 extends Thread{
    public static void main(String[] args) {

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addLast(5);
        ad1.offerLast(10);

        System.out.println(ad1);
        System.out.println(ad1.getLast());
        System.out.println(ad1.peekLast());
        ad1.pollFirst();
        ad1.removeFirst();
        System.out.println(ad1);


        ad1.pollLast();
        ad1.removeLast();
        System.out.println(ad1);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());


    }
}