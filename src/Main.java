import java.util.*;
public class Main {
    static int input = 0;
    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        boolean goback = true;
        while (goback) {
            welcome();
            if (input == 1) {
                System.out.println("Welcome Chairman, how do you want to proceed?");
                System.out.println("1: Log new member");
                System.out.println("2: Delete current member");
                System.out.println("3: See all members");
                System.out.println("4: Back to menu");
                input = scan.nextInt();

                if (input == 1) {
                    input = 0;

                }

                if (input == 2) {
                    input = 0;

                }

                if (input == 3) {
                    input = 0;

                }

                if (input == 4) {
                    input = 0;
                    //goback = false;
                }


            }

           if (input == 2) {
               boolean trainerMenu = true;
               while (trainerMenu) {
                    System.out.println("Welcome Trainer, how do you want to Proceed");
                    System.out.println("1: Calendar");
                    System.out.println("2: Log swimmers best time");
                    System.out.println("3: Top 5 list");
                    System.out.println("4: Back to menu");
                    input = scan.nextInt();
                    if (input == 1) {
                        input = 0;

                    }

                    if (input == 2) {
                        input = 0;

                    }

                    if (input == 3) {
                        input = 0;

                    }

                    if (input == 4) {
                        input = 0;
                        trainerMenu = false;
                    }

                    if (input > 4) {
                        input = 0;
                        System.out.println("Du skal vælge menupunkte 1 - 4");
                    }
               }
                if (input == 3) {


                }
                if (input == 4) {


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
            input = scan.nextInt();
        }

}