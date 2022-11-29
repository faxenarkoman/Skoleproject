import java.util.*;
public class Main {
           static int input = 0;

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        boolean run = false;
        while(run = true)
        {
            welcome();
            if (input == 1) {
                System.out.println("Welcome Chairman, how do you want to proceed?");
                System.out.println("1: Log new member");
                System.out.println("2: Delete current member");
                System.out.println("3: See all members");
                System.out.println("4: Back to menu");
                input = 0;
                input = scan.nextInt();
                if (input == 1) {


                }
                if (input == 2) {


                }
                if (input == 3) {


                }

                if (input == 4) {
                    run = false;
                    break;
                }

                if (input == 5) {
                    System.out.println("Have nice day!");
                    System.out.println("Goodbye");
                    System.exit(0);
                }
            }
        }

    }

    private static void welcome()
    {
         System.out.println("Welcome to Delfinen Choose your account");
         System.out.println("(1. ---Chairman---)");                    
         System.out.println("(2. ---Trainer---)");                     
         System.out.println("(3. ---Cashier---)");                     
         System.out.println("(4. ---Admin---)");
         System.out.println("(5. ---Close Program---)");
         Scanner scan = new Scanner(System.in);
         input = 0;
         input = scan.nextInt();
    }
}