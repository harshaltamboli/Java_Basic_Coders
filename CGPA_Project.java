import java.util.Scanner;
public class CGPA_Project
{
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        float SoftwareEngineering;
        float DataStructure;
        float AspNet;
        float Java;
        float sum;
        float CGPA;
        System.out.println("Enter The Software Engineering Marks:");
        SoftwareEngineering=scanner.nextFloat();

        System.out.println("Enter The Data Stucture Marks :");
        DataStructure=scanner.nextFloat();

        System.out.println("Enter The AspNet marks:");
       AspNet=scanner.nextFloat();

        System.out.println("Enter The java Marks:");
        Java=scanner.nextFloat();

        sum =(SoftwareEngineering+DataStructure+AspNet+Java);
//        sum=scanner.nextFloat();
        System.out.println("Addition:" +sum);

        CGPA=(SoftwareEngineering+DataStructure+AspNet+Java)/40;
        // CGPA=scanner.nextFloat();
        System.out.println("Cgpa:" +CGPA);
    }
}
