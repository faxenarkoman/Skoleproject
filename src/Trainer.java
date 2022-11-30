import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Trainer
{
    static Scanner scanner = new Scanner(System.in);


    private Object dateTimeFormatter;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MMMM.YYYY.mn.ss");
    public static void trainer()
    {
        System.out.println("Write the swimmers time like this: dd.MMMM.mn.ss");
        String time = scanner.nextLine();
        System.out.println(time);
    }
}
