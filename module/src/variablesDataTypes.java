//The place value is the position of each digit in a 4 digit number.
import java.util.Scanner;
public class variablesDataTypes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 4 digit number to check:");
        int a = sc.nextInt();
        int th = a/1000;
        System.out.println(th+" is in the thousands place");
        int hu = (a%1000)/100;
        System.out.println(hu+" is in the hundreds place");
        int tens = (a%100)/10;
        System.out.println(tens+" is in the hundreds place");
        int ones = a%10;
        System.out.println(ones+" is in the hundreds place");

        int[] arr = {3,2,4,5};
    }
}
