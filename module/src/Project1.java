import java.util.Scanner;

//Code for converting Celsius to Fahrenheit or vice versa
public class Project1 {
    public static void main(String[] args){
        System.out.println("For converting Cel to Far enter: 1\nFor converting Far to Cel enter: 2");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        System.out.println("Enter the value for conversion:");
        int val = sc.nextInt();
        switch (option){
            case 1:
                int ans = (9*val)/5+32;
                System.out.println(val+" degree is "+ ans+" Fahrenheit");
                break;
            case 2:
                int value = 5*(val - 32)/9;
                System.out.println(val+" degree is "+ value+" Celsius");
                break;
            default:
                System.out.println("Try Again");

        }
    }
}
