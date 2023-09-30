import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("To covert  Celsius to Fahrenheit : 1\nTo covert Fahrenheit to Celsius: 2");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        System.out.println("Enter the value to covert");
        int value = sc.nextInt();
        switch(option){
            case 1:
                float far = (float) ((1.8*value)+32);
                System.out.println(value+" degree  is equal to "+far+" Fahrenheit");
                break;
            case 2:
                double cel =  ((value - 32)/1.8);
                System.out.println(value+" degree  is equal to "+cel+" Celsius");
                break;
            default:
                System.out.println("Try Again");
        }

    }
}