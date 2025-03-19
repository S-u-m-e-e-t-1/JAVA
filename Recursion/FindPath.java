public class FindPath{
    public static int findPath(int a,int b,int c,int d){
        if(a==c && b==d){
            return 1;
        }
        if(a>c || b>d){
            return 0;
        }
        return findPath(a,b+1,c,d)+findPath(a+1,b,c,d);
    }
    public static void main(String[] args) {
        int c=findPath(0,0,3,3);
        System.out.println(c);
    }
}