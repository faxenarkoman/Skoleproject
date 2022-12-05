import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Trainer
{
    static String placeHolder = "";
    static Scanner scanner = new Scanner(System.in);


    private Object dateTimeFormatter;
    public static void trainer()
    {
        System.out.println("Write the swimmers time like this: dd/MM/yyyy-hh:mm:ss");
        String bestTime = "19/12/2021-13:23:59";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy-hh:mm:ss");
        bestTime = scanner.nextLine();
        LocalDateTime date = LocalDateTime.parse(bestTime,dtf);
        System.out.println(dtf);

    }
}
