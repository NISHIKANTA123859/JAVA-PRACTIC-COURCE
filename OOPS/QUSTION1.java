class cilinder{
    private int radious;
    private int hight;

    public cilinder(int radious,int hight){
        this.radious=radious;
        this.hight=hight;
    }

    void setradious(int r){
        this.radious=r;
    }
    public int getradious(){
        return radious;
    }
    void sethight(int h){
        this.hight=h;
    }
    public int gethight(){
        return hight;
    }
    public double surfacearea(){
        return 2*3.14*radious*radious+2*3.14*radious*hight;
    }
    public double volume(){
        return 3.142*radious*radious*hight;
    }

}
//problem 4
class rectangel{
    private int length;
    private int breath;

    public rectangel(){
        this.length=4;
        this.breath=5;
    }
    public rectangel(int length,int breath){
        this.length=length;
        this.breath=breath;

    }
   public int getlength(){
    return length;
    }
    public int getbreath(){
        return breath;
    }
}
//problem 5
class sphere{
    private int radious;
    
    public sphere(int radious ){
        this.radious=radious;
    }

    public double surfacearea(){
        return 4*Math.PI*radious*radious;
    }
    public double volume(){
        return 4/3*Math.PI*radious*radious*radious;
    }
}

public class QUSTION1 {
    public static void main(String[] args) {
        //(1)crate a class game "guess the number"once .
        //problem 1

        // cilinder myCilinder=new cilinder();
        // cilinder myCilinder=new cilinder(2,3);
        // // myCilinder.sethight(22);
        // int h=myCilinder.gethight();
        // System.out.println(h);
        // // myCilinder.setradious(33);
        // int r=myCilinder.getradious();
        // System.out.println(r);
        // System.out.println(myCilinder.surfacearea());
        // System.out.println(myCilinder.volume());



        //problem 4
        // rectangel rect=new rectangel();
        // System.out.println(rect.getbreath());
        // System.out.println(rect.getlength());

        //problem 5
        // sphere s=new sphere(4);
        // System.out.println(s.surfacearea());
        // System.out.println(s.volume());


    }
}
