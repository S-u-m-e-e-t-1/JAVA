class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class thisuse {
    public static void main(String[] args) {
        MyEmployee ironman= new MyEmployee();

        ironman.setName(" tony stark");
        System.out.println(ironman.getName());
        ironman.setId(234);
        System.out.println(ironman.getId());
    }
}