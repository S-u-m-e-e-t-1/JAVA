public class CallFriend{
    public static int callFriend(int a){
        if(a<=1){
            return 1;
        }
        return callFriend(a-1)+(a-1)*callFriend(a-2);
    }
    public static void main(String[] args) {
        int c=callFriend(4);
        System.out.println(c);
    }
}