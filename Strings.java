import java.util.Scanner;
public class Strings {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("----stings functions-----");

        String str="Harshal Tamboli";
        System.out.println(str);

        System.out.println("*****Check Lenght-****");

        String lengths="Harshal Tamboli";
        System.out.println(lengths.length());

        System.out.println("*****  check element no ******");
        String stp="Harshal Tamboli";
        System.out.println(stp.charAt(4));

        System.out.println("**** check for element no ****");

        String ptr="Harshal Tamboli";
        System.out.println(ptr.indexOf('s'));

        System.out.println("**** compare to number ****");
        String gtr="Harshal Tamboli";
        String mtr="karshal Tamboli";
        System.out.println(gtr.compareTo(mtr));


        System.out.println("**** check the element true/false ****");
        String ntr="Harshal Tamboli";
        System.out.println(ntr.contains("H"));

        System.out.println("**** substrings ****");
        String ntrs="Harshal Tamboli";
        System.out.println(ntrs.substring(0,10));

        System.out.println("**** UpperCase****");
        String gtrs="harshal tamboli";
        System.out.println(gtrs.toUpperCase());

        System.out.println("**** LowerCase****");
        String ktr="HARSHAL TAMBOLI";
        System.out.println(gtrs.toLowerCase());


        System.out.println("___________________________");

    }
}
