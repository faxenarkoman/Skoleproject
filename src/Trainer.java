import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Trainer
{
    double bestTime = 0.0;
    static String placeHolder = "";
    static Scanner scanner = new Scanner(System.in);


    private Object dateTimeFormatter;
    public void trainer()
    {
        bestTime = scanner.nextDouble();

    }
}
