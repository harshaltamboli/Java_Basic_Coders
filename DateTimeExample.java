import java.util.Date; // Importing the Date class
import java.text.SimpleDateFormat; // Importing SimpleDateFormat class to format date

public class DateTimeExample {    public static void main(String[] args) {
    // Creating a Date object representing the current date and time
    Date currentDate = new Date();

    // Displaying the current date and time
    System.out.println("Current Date and Time: " + currentDate);

    // Formatting the date using SimpleDateFormat
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    String formattedDate = dateFormat.format(currentDate);
    System.out.println("Formatted Date and Time: " + formattedDate);
}

}

