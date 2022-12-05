import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;



public class Main {
    static int input = 0;
    static Scanner scan;


    public static void main(String[] args) {


        ArrayList<Swimmer> swimmerList = new ArrayList<>();
        swimmerList.add(new Swimmer(1000, 16, "Patric", "breaststroke", true, false, true));
        swimmerList.add(new Swimmer(1600, 18, "Louise", "butterfly", true, true, true));
        swimmerList.add(new CompetitiveSwimmer(1600, 20, "Peter", "Crawl", true, true, true, 55, 22));
        




        scan = new Scanner(System.in);

        boolean goback = true;
        while (goback) {
            mainmenu();
            if (input == 1)
            {
                boolean chairmanMenu = true;
                while(chairmanMenu) {
                    System.out.println("Hello Chairman, how do you want to proceed?");
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
                        chairmanMenu = false;
                    }
                    if (input > 4) {
                        input = 0;
                        System.out.println("You need to choose a menu-point from 1 - 4");
                        System.out.println();
                    }
                }
            }

           if (input == 2) {
               boolean trainerMenu = true;
               while (trainerMenu) {
                   System.out.println("Trainer, how do you want to Proceed");
                   System.out.println("1: Log swimmers best time");
                   System.out.println("2: Top 5 list");
                   System.out.println("3: Back to menu");
                   input = scan.nextInt();

                   if (input == 1) {
                       input = 0;
                       Trainer.trainer();
                   }

                   if (input == 2) {
                       input = 0;

                   }

                   if (input == 3) {
                       input = 0;
                       trainerMenu = false;
                   }

                   if (input > 3)
                   {
                       input = 0;
                       System.out.println("You need to choose a menu-point from 1 - 4");
                       System.out.println();
                   }
               }
           }
           if (input == 3)
           {
                boolean cashiermenu=true;
                while(cashiermenu)
                {
                    System.out.println("Welcome Cashier");
                    System.out.println("1: Show arrears");
                    System.out.println("2: Back to main manu");
                    input = scan.nextInt();

                    if (input == 1)
                    {
                        //method here
                    }
                    if (input == 2)
                    {
                        input = 0;
                        cashiermenu = false;
                    }
                    else if (input > 2)
                    {
                         input = 0;
                         System.out.println("You need to choose a menu-point from 1 - 4");
                    }    System.out.println();
                }


           }
           if (input == 4)
           {
               boolean adminmenu = true;
               while (adminmenu) {


                   System.out.println("Whats your command, commander");
                   System.out.println("1: Log new member");
                   System.out.println("2: Delete current member");
                   System.out.println("3: See all members");
                   System.out.println("4: Trainers Calendar");
                   System.out.println("5: Log swimmers best time");
                   System.out.println("6: Top 5 list");
                   System.out.println("7: Back to menu");
                   input = scan.nextInt();

                   if (input == 1)
                   {
                      input = 0;
                   }

                   if (input == 2)
                   {
                      input = 0;
                   }

                   if (input == 3)
                   {
                      input = 0;

                       for(Swimmer s: swimmerList)
                       {
                           System.out.println(s.toString());
                           if (s.isStatus())
                           {
                               System.out.println("im a active swimmer!");
                           } else
                           {
                               System.out.println("im a passive swimmer");
                           }
                       }
                   }

                   if (input == 4)
                   {
                        input = 0;
                   }

                   if (input == 5)
                   {
                      input = 0;
                   }

                   if (input == 6)
                   {
                      input = 0;
                   }

                   if (input == 7)
                   {
                       input = 0;
                       adminmenu = false;
                   }

                   if (input > 7)
                   {
                      System.out.println("You need to choose a menu-point from 1 - 7");
                      System.out.println();
                   }
               }

           }
            if (input == 5)
            {
                System.out.println("Have nice day!");
                System.out.println("Goodbye");
                System.exit(0);
                }



        }
    }
        private static void mainmenu()
        {
            System.out.println("mainmenu to Delfinen Choose your account");
            System.out.println("(1. ---Chairman---)");
            System.out.println("(2. ---Trainer---)");
            System.out.println("(3. ---Cashier---)");
            System.out.println("(4. ---Admin---)");
            System.out.println("(5. ---Close Program---)");
            input = scan.nextInt();
        }

}