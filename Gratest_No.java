import java.util.Scanner;
public class Gratest_No {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The first No");
        int num1=scanner.nextInt();

        System.out.println("Enter The secound No");
        int num2=scanner.nextInt();

        System.out.println("Enter The third No");
        int num3=scanner.nextInt();

        if(num1>num2)
         if(num1>num3)

             System.out.println("No 1 is Grater :"+ num1);

        if(num2>num1)
            if(num2>num3)

                System.out.println("No 2 is Grater :"+ num2);

        if(num3>num1)
            if(num3>num2)

                System.out.println("No 3 is Grater :"+ num3);


                System.out.println(num1+num2+num3);
    }
}
