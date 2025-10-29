import java.util.Random;
import java.util.Scanner;
class game{
    public int number;
    public int inputnumber;
    public int noOfGuesses=0;

    public int getnoOfGuesses(){
        return noOfGuesses;
    }

    public void setnoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }

     game(){
        Random r=new Random();
        this.number=r.nextInt(100);

    }

    void takeuserinput(){
        System.out.print("guess the number:");
        Scanner sc=new Scanner(System.in);
        inputnumber=sc.nextInt();

    }

    boolean isCorrectNumber(){
        if(inputnumber==number){
            noOfGuesses++;
            System.out.format("yes you guessed it right,it was %d\n you guessed it in %d attempts",number,noOfGuesses);
            return true;
        }
        else if (inputnumber<number) {
            System.out.println("Too low..."); 
        }
        else if (inputnumber>number) {
            System.out.println("Too high..."); 
        }
        return false;

    }

}
public class exercise {
    public static void main(String[] args) {
        /*create a class game,which allows  user to play "guess the number" game onec.
        game should have following methods;
        (1)Constructer to generate the rendom number
        (2)takeuserinput() to take a user input of number
        (3)isCorrectNumber() to detect whether the number is enter by the user is true
        (4)getter and setter for noOfGuesses
        use properties such as noOfGuesses(int)
         */


         game g=new game();
         boolean b=false;
         while(!b){
         g.takeuserinput();
         b=g.isCorrectNumber();
         System.out.println(b);
         }


    }
}
