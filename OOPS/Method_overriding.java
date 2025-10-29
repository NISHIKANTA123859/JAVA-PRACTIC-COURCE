class A{
    public int a;
    public int bapun(){
        return 3;
    }
    public void math1(){
        System.out.println("i am an mathod 1 in class of A");
    }
}
class B extends A{
    @Override
    public void math1(){
        System.out.println("i am method 1 in class B ");
    }
    public void math2(){
        System.out.println("i am method 2 in class B ");
    }
}
class animal1{
    void sound(){
        System.out.println("animals make sound");
    }
}
class dog1 extends animal1{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
class cat1 extends animal1{
    @Override
    void sound(){
        System.out.println("cat meows");
    }
}
class Vehicle {
    void run() {
        System.out.println("Vehicle is running...");
    }
}
class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running smoothly...");
    }
}
class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running fast...");
    }
}

public class Method_overriding {
    public static void main(String[] args) {
        //problem 1
    //   A a=new A();
    //   a.math1();
    //   B b=new B();
    //   b.math1();

       //problem 2
    //   animal1 x=new animal1();
    //   animal1 y=new dog1();
    //   animal1 z=new cat1();
    //   x.sound();
    //   y.sound();
    //   z.sound();

      //problem 3
      Vehicle a1=new Vehicle();
      Vehicle a2=new Car();
      Vehicle a3=new Bike();
      a1.run();
      a2.run();
      a3.run();




    }
}
