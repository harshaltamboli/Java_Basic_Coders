package BassicsOfjava;
import java.util.Scanner;
public class principale_rate_time {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ener The Price:");
        int principal=sc.nextInt();
        System.out.println("Ener The rate:");
        int rate= sc.nextInt( );
        System.out.println("Ener The time:");
        int time=sc.nextInt();
        int cal= (principal*rate*time)/500;
        System.out.println(cal);
    }
}
