public class PlaceTile {
    public static int placeTile(int n, int m){
        if(m==n){
          return 2;
        }
        if(n<m){
          return 1;
        }
        return placeTile(n-m,m)+placeTile(n,m-1);
    }
    public static void main(String[] args) {
        System.out.println(placeTile(3,4));
    }
}