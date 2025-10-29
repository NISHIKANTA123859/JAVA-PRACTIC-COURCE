class base{
    int x;

   public void setbase(int x){
        System.out.println("i am bapun");
        this.x=x;
    }
    public int getbase(){
        return x;
    }
    void printme(){
        System.out.println("i am an constructor");
    }
}
class derive extends base{
    int y;

    public void setderive(int y){
        this.y=y;
        System.out.println("i am rahul");
    }
    public int getderive(){
        return y;
    }
}
class animal{
    void show(){
        System.out.println("this a animal");
    }
   public  class dog extends animal{
      public  void colour(){
        System.out.println("black");
        }
    }
}
public class Inheritance {
    public static void main(String[] args) {
        base b=new base();
        b.setbase(3);
        System.out.println(b.getbase());
        derive d=new derive();
        d.setderive(5);
        System.out.println(d.getderive());

       //problem 1
       animal a=new animal();
       a.show();

        
    }
}
