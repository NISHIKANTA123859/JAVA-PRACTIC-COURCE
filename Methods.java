public class Methods {
    //methods
    static void telljokes(){
        System.out.println("well come bapun");
    }
    static void change(int []arr){
        arr[2]=45;
    }

    static void foo(){
        System.out.println("good morning bro!");
    }
    static void foo(int a){
        System.out.println("good morning "+a+"bro");
    }
    static void foo(int a,int b){
        System.out.println("good morning "+a+"bro");
        System.out.println("good morning "+b+"bro");
    }



//  static int logic(int x,int y){
//         int logic(int x,int y){     //remove object name
//        int z;
//        if (x>y){
//            z=x+y;
//        }
//        else {
//           z=(x+y)*5;
//        }
//        return z;
//    }



//
//    static void telljoke(){
//        System.out.println("Why can’t your nose be 12 inches long?\n" +
//                " Because then it would be a foot!");
//    }
//    static void change(int[] arr) {
//        arr[0] = 98;
//    }
        public static void main (String[]args){
            //example (1)
//        int a=3;
//        int b=5;
//        int c;
//            if(a>b){
//                c=a+b;
//            }
//            else{
//                c=(a+b)*5;
//
//            }
            //c=logic(a,b);//method calling 1 (with static )
            //method calling 2 (without static)
//            Methods obj=new Methods();
//            c=obj.logic(a,b);

            //Example (2)
            //method calling 2
//            int a1=10;
//            int b1=5;
//            int c1;
//            if(a1>b1){
//                c1=a1+b1;
//            }
//            else{
//                c1=(a1+b1)*5;
//
//            }
//            System.out.println(c);


           // c1=logic(a1,b1);//method calling (with static)
            //method calling 2 (without static)
//            Methods obj1=new Methods();
//            c1=obj1.logic(a1,b1);
//            System.out.println(c1);


//            int marks[] = {22, 31, 32, 44, 5};
//            change(marks);
//            System.out.println("the value of x after change is =" + marks[2]);


            //method overloading
            foo();
            foo(600);
            foo(200,300);

        }
    }

