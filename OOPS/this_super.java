class akclass{

    int a;
    public int  getA(){
        return a;
    }
    public akclass(int v) {
      this.a=v;
    }
    
//    public int returnone(){
//     return 1;
//    }
}
class doclss extends akclass{

    public doclss(int c) {
        super(c);
        System.out.println("i am an conmstructor"+c);
    }
    
}
public class this_super {
    public static void main(String[] args) {
      akclass e=new akclass(12);
      System.out.println(e.getA()); 
      
      doclss d=new doclss(44);
    
    }
}
