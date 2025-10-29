public class varargs {
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
    static int sum(int...arr){
        int result=0;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("wellcome to varargs topic!  ");
        System.out.println("the sum of 3 and 5 is ="+sum(3,5));
        System.out.println("the sum of 3,4 and 5 is ="+sum(3,4,5));
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum());
    }
}
