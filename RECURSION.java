import java.util.*;
public class RECURSION {
    static int factorial(int n){
    //factorial(0)=1
    if(n==0 || n==1){
        return 1;
    }
    else{
       return n * factorial(n-1);
    }
}
    static int factorial_iterative(int n){
    //factorial(0)=1
    if(n==0 || n==1){
        return 1;
    }
    else{
       int product =1;
       for(int i=1;i<=n;i++){//1 to n
            product *=i;
       }
       return product;

    }
}
    

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the value:");
       int n=sc.nextInt();
       System.out.println("The value of factorial n is :"+factorial(n));
        System.out.println("The value of factorial n is :"+factorial_iterative(n));
    }
}
