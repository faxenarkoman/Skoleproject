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
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy-mm:ss");
    public static void trainer()
    {
        System.out.println("Write the swimmers time like this: dd/MM/yyyy-mm:ss");
        String bestTime = "19/12/2021-23:59";
        bestTime = scanner.nextLine();
        LocalDateTime date = LocalDateTime.parse(bestTime);
        LocalDate.from(DateTimeFormatter.ISO_LOCAL_DATE.parse(bestTime));
        DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));

    }
}
