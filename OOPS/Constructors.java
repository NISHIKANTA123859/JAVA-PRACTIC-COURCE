class myemployee1{
    private int id;
    private  String name;
    private int salary;

    // public myemployee1(){
    //     id=22;
    //     name="xyz";
    // }
    public myemployee1(String n,int i){
        i=id;
        n=name;
    }
    public myemployee1(int s){
        salary=s;
    }

    public String getname(){
        return name;
    }
    void setname(String n){
       this.name=n;
    }
    public int getid(){
        return id;
    }
    void setid(int i){
        this.id=i;
    }
    public int getsalary(){
        return salary;
    }
}
public class Constructors {
    public static void main(String[] args) {
        // myemployee1 bapun=new myemployee1();
        // myemployee1 bapun=new myemployee1("bapun",22);
        myemployee1 bapun=new myemployee1(2000);

        System.out.println(bapun.getname());
        System.out.println(bapun.getid());
        System.out.println(bapun.getsalary());

    }
}
