class myemployee{
   private  int id;
    private String name;


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
}
class circle{
    private double radious;

    //setter method
    void setradious(double radious){
        if(radious>0){
            this.radious=radious;
        }
        else{
            System.out.println("radious must be positive");
        }
    }
    //Getter method
    public double getredious(){
        return radious;
    }
    public double getarea(){
        return Math.PI*radious*radious;
    }
    public double getperimeter(){
        return 2*Math.PI*radious;
    }
}
public class ACCESS_MODIFIERS {
    public static void main(String[] args) {
      myemployee bapun=new myemployee();
      bapun.setname("nishikanta");
      System.out.println(bapun.getname());
      bapun.setid(222);
      System.out.println(bapun.getid());

      circle c1=new circle();
      c1.setradious(7);
      System.out.println(c1.getarea());
      System.out.println(c1.getperimeter());

    }
}
