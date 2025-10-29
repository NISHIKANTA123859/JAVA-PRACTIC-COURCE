class employe{
    int id;
    String name;
    int salary;
    void printdetails(){
        System.out.println("my id is "+id);
        System.out.println(", my name is "+name);
        System.out.println("& my salary is "+salary);
    }
    public int getsalary(){
        return salary;
    }

}
public class CUSTOM {
    public static void main(String[] args) {
        System.out.println("this is my custom class");
        employe bapun=new employe();
        employe ram=new employe();


        bapun.id=18;
        bapun.name="raj";
        bapun.salary=3000;

        // System.out.println(bapun.id);
        //System.out.println(bapun.name);
        bapun.printdetails();
        bapun.getsalary();

        ram.id=222;
        ram.name="sagar";
        ram.salary=6000;
        // System.out.println(ram.id);
        //System.out.println(ram.name);
        System.out.println(bapun.salary);

     



    }
}
