class circle{
public int redious;
    circle(int r) {
        System.out.println("i am paramaterized constructor");
        this.redious=r;
    }
    
    public int radious;
    public double  area(){
        return Math.PI*this.radious*this.radious;
    }
}

class cylinder1 extends circle{
     public int hight;
     cylinder1(int r,int h) {
        super(r);
        System.out.println("i am cylinder1 parameterized constructor");
        this.hight=h;        
    }
    
    public double volum(){
        return Math.PI*this.radious*this.radious*this.hight;
    }
}
public class practicset1 {
    public static void main(String[] args) {
        //problem 1
        cylinder1 obj=new cylinder1(1,3);
        //circle cr=new circle(12);
        
    }
}
