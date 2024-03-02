import java.util.Scanner;
public class Leap_Year {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Leap Year:");
        int year=scanner.nextInt();

        if(year%100==0 && year%400==0 || year %100!=0 && year %4==0)
        {
            System.out.println("Leap year");
        }
        else
        {
            System.out.println("not Leap Year");
        }
    }
}
