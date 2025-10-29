

class employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
       return  name;
    }
}
class cellphone{
    void details(){
        System.out.println("Ringing...");
        System.out.println("Calling...");
        System.out.println("Vrabating...");
    }
}
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
       return  4*side;
    }
}
class rectangle{
    int l;
    int w;
    public int area(){
        return l*w;
    }
    public int perimeter(){
        return 2*(l+w);
    }
}
class Tommyvecetti{
    void hit(){
        System.out.println("hitting the enemey");
    }
     void run(){
        System.out.println("running the enemey");
    }
     void fire(){
        System.out.println("fire the enemey");
    }
}
class circle {
    int r;
   public double  area(){
    return Math.PI*r*r;
   }
   public double perimeter(){
    return 2*Math.PI*r;
   }
}
public class QUSTION {
    public static void main(String[] args) {
        //problem 1
    //     employee raj=new employee();
    //     raj.name="sagar";
    //     raj.salary=1000;
    //     System.out.println(raj.getsalary());
    //    System.out.println(raj.getname());

       //problem 2
    //    cellphone c=new cellphone();
    //    c.details();

       //problem 3
    //    square s=new square();
    //    s.side=4;
    //    System.out.println(s.area());
    //    System.out.println(s.perimeter());

      //problem 4
    //   rectangle r=new rectangle();
    //   r.l=2;
    //   r.w=4;
    //   System.out.println(r.area());
    //   System.out.println(r.perimeter());

      //problem 5
    //   Tommyvecetti player=new Tommyvecetti();
    //   player.hit();
    //   player.run();
    //   player.fire();

      //problem 6
    //   circle c=new circle();
    //   c.r=7;
    //   System.out.println(" the area is ="+c.area());
    //   System.out.println("the perimerer is="+c.perimeter());

       
    }
}
