import java.util.Scanner;

public class guessing {

        public static void main(String[] args) {
            int myNumber;
            Scanner sc = new Scanner(System.in);
            int randNumber = (int) (Math.random()*50);
            do {
                System.out.println("Guess the number (0-50): ");
                myNumber = sc.nextInt();
                if(randNumber==myNumber){
                    System.out.println("WOW your guess is correct: "+myNumber);
                    break;
                }else if(randNumber > myNumber){
                    System.out.println("your guess is LOW ");
                }else if(randNumber<myNumber){
                    System.out.println("your guess is HIGH ");
                }
            }while (myNumber>=0);
            System.out.println("Random NO: "+randNumber);




        }

}
