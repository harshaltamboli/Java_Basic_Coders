import java.util.Scanner;
public class if_else_Exercise1 {

    public static void main(String[]args){


        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter The No");
       int Input=scanner.nextInt();

       if(Input>0){
           System.out.println("No is positive");
       }
       else if(Input<0){
           System.out.println("No is negaive");
        }
       else System.out.println("No is Zero");

    }
}
