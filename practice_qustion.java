public class practice_qustion {
    static void multiplication(int n){
        for (int i=1;i<=10;i++){
            System.out.format("%d x %d =%d\n",n,i,n*i);
        }
    }
    static void paten1(int n){
        for (int i=0;i<=n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sumRec(int n){
        if (n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    static void paten2(int n){
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fib(int n){
        /*if (n==1){
            return 0;
        }
        else if (n==2) {
           return 1;
        }*/
        if (n==1 || n==2){
            return n-1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
    static void parten_rec(int n){
        if(n>0){
            parten_rec(n-1);
            for (int i=0;i<n;i++){
                System.out.print("*");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //problem 1
        //multiplication(3);

          //problem 2
       //paten1(6);

        //problem 3
       //int c=sumRec(3);
        //System.out.println(c);

        //problem 4
        //paten2(6);

        //problem 5
       // The Fibonacci series is: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
        //int result=fib(5);
        //System.out.println(result);

        //problem 6
        //parten_rec(6);


    }
}
