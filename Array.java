//public class Array {
//    public static void main(String[] args) {
//        int [] marks=new int [5];  //(1)declaration method
//        int []marks;               //(2)
//        marks=new int[5];
//        int []marks={70,60,50,80,90}; //(3)
//        marks[0]=70;
//        marks[1]=60;
//        marks[2]=50;
//        marks[3]=80;
//        marks[4]=90;
//        System.out.println(marks[4]);

        //length of array
       // int [] marks={20,30,80,67,88};
       // float[]marks={20.7f,38,89,97,2};
//        String[]students={"bapun","ram","sita","hari"};
//        System.out.println(marks[2]);
//        System.out.println(marks.length);
//        System.out.println(marks[0]);
//        System.out.println(students[1]);
//        System.out.println(students.length);

        //Displaying the Array(Naive way);
//        int [] marks={20,30,80,67,88};
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        //Displaying the Array(for loop);
//        int [] marks={20,30,80,67,88};
//        for (int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }

        //wap to print the element of an array in revers order
//        int [] marks={20,30,80,67,88};
//        for (int i=marks.length -1;i>=0;i--){
//            System.out.println(marks[i]);
//        }
        //Displaying the Array(for-each loop);
//        int []marks={20,30,80,67,88};
//        for (int elements:marks){
//            System.out.println(elements);
//        }

        //2-D array
//        int [][]flats;
//        flats=new int[2][3];
//        flats[0][0]=101;
//        flats[0][1]=102;
//        flats[0][2]=103;
//        flats[1][0]=201;
//        flats[1][1]=202;
//        flats[1][2]=203;
//        for (int i=0;i<flats.length;i++){
//            for (int j=0;j<flats[i].length;j++) {
//                System.out.print(flats[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("\n");
//        }


        //problem's
        //(1)create an array of 5 floats and calculate their sum
//        float[] a={22.1f,23.5f,65.7f,76.9f,43.8f};
//        float sum=0;
//        for (float elements:a){
//            sum=sum+elements;
//        }
//        System.out.println("the value of sum is " +sum);

        //wap to find out weather a given integer is present in array or not.
//        float[] a={22.1f,23.5f,65.7f,76.9f,43.8f};
//        float num=23.5f;
//        boolean isInarray=false;
//        for (float elements:a) {
//            if (num == elements) {
//                isInarray = true;
//                break;
//            }
//        }
//        if (isInarray) {
//            System.out.println("the value is present in array");
//        } else {
//            System.out.println("the value is not present in array");
//        }

        //calculate the average marks from an array containing marks of all student in physics using for each loop.
//        float[] marks={22.1f,23.5f,65.7f,76.9f,43.8f};
//        float sum=0;
//        for (float elements:marks){
//            sum=sum+elements;
//        }
//        System.out.println("the value of avrage mark is = "+sum/ marks.length);
        //creat a java program to add two matrix of size 2x3.
//        int [][] mat1={{1,2,3},{4,5,6}};
//        int [][] mat2={{2,3,4},{7,8,9}};
//        int [][] result={{0,0,0},{0,0,0}};
//        for (int i=0;i< mat1.length;i++){//row number of times
//            for (int j=0;j<mat1[i].length;j++) {//column number of time
//                System.out.format("setting value for i=%d and j=%d\n", i, j);
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//        }
//        System.out.println("the sum of matrix are:");
//        //printing the elements of 2-D array
//        for (int i=0;i< mat1.length;i++) {//row number of times
//            for (int j = 0; j < mat1[i].length; j++) {//column number of time
//                System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println(" ");
//        }


//        int []arr={1,2,3,4,5};
//        int l= arr.length; //5
//        int n=Math.floorDiv(l,2);// 5/2=2.5 consider(2)
//        int temp;
//        for (int i=0;i<n;i++){
//            temp=arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=temp;
//        }
//        for (int elements:arr){
//            System.out.print(elements+" ");
//        }
//    }
//}
