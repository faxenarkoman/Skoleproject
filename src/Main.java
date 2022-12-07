import java.util.*;
public class Main {
    static int input = 0;
    static Scanner scan;
    double bestSwimmingResults;
    static int count;

    public static void main(String[] args) {


        ArrayList<Swimmer> swimmerList = new ArrayList<>();
        swimmerList.add(new Swimmer(0, "Patric", 16, 1000, "breaststroke", true, false, true));
        swimmerList.add(new Swimmer(1, "Louise", 18, 1600, "butterfly", true, true, true));
        swimmerList.add(new CompetitiveSwimmer(2, "Peter", 20, 1600, "Crawl", true, true, true, 55, 22));
        swimmerList.add(new Swimmer(3, "Ole", 65, 500, "Just chilling in the kids pool", false, false, false));
        swimmerList.add(new Swimmer(4, "Ahmed", 45, 500, "Chilling in the jacuzzi", false, false, false));
        swimmerList.add(new CompetitiveSwimmer(5, "Jens", 18, 1600, "Crawl", true, true, true, 51, 24));
        swimmerList.add(new CompetitiveSwimmer(6, "Martin", 19, 1600, "butterfly", true, true, true, 56, 23));


        for (int i = 0; i <= swimmerList.size(); i++)
        {
            count++;
        }


        scan = new Scanner(System.in);

        boolean goback = true;
        while (goback) {
            mainmenu();
            if (input == 1) {
                boolean chairmanMenu = true;
                while (chairmanMenu) {
                    System.out.println("Hello Chairman, how do you want to proceed?");
                    System.out.println("1: Log new member");
                    System.out.println("2: See all members");
                    System.out.println("3: Back to menu");
                    input = scan.nextInt();

                    if (input == 1) {
                        input = 0;
                        System.out.println("Insert name");
                        String name = scan.next();
                        System.out.println("Insert Age");
                        int age = scan.nextInt();
                        System.out.println("Insert contingent");
                        int contingent = scan.nextInt();
                        System.out.println("Insert form of activity");
                        String formOfActivity = scan.next();
                        System.out.println("False = passive swimmer / True = swimmer");
                        boolean status = scan.nextBoolean();
                        System.out.println("False = junior swimmer / True = senior swimmer");
                        boolean ageGroup = scan.nextBoolean();
                        System.out.println("False = exerciser / True = competitive swimmer");
                        boolean trainingLevel = scan.nextBoolean();

                        double bestSwimmingResults = 0.0;
                        int date = 1;

                        int id = 0;


                        if (trainingLevel == true) {
                            swimmerList.add(new CompetitiveSwimmer(id, name, age, contingent, formOfActivity, status, ageGroup, trainingLevel, bestSwimmingResults, date));
                            count++;
                            id++;
                        } else if (trainingLevel == false) {
                            swimmerList.add(new Swimmer(id, name, age, contingent, formOfActivity, status, ageGroup, trainingLevel));
                            count++;
                            id++;
                        }
                    }


                    if (input == 2) {
                        input = 0;
                        for (Swimmer s : swimmerList) {
                            System.out.println(s.toString());
                            if (s.isStatus()) {
                                System.out.println("    " + s.name + " is a active swimmer!");
                            } else {
                                System.out.println("    " + s.name + " is a passive swimmer");
                            }
                            if (s.isAgeGroup()) {
                                System.out.println("    " + s.name + " is a Junior");
                            } else {
                                System.out.println("    " + s.name + " is a senior");
                            }
                            if (s.isTraningLevel()) {
                                System.out.println("    " + s.name + " is a competitive Swimmer");
                            } else {
                                System.out.println("    " + s.name + " is a exerciser");
                            }
                        }
                    }

                    if (input == 3) {
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
                        for (int i = 0; i < swimmerList.size(); i++) {

                            //for (Swimmer s : swimmerList)

                            System.out.println("What is the ID of the person which you want to log new best time");
                            swimmerList.get(i).id = scan.nextInt();
                            System.out.println("You Chose " + swimmerList.get(i).name);
                            System.out.println("What is the new personal record");
                            double doubleinput = scan.nextDouble();
                            //swimmerList.get(i).bestSwimmingResults = doubleinput;
                            trainerMenu = false;
                        }

                        if (input == 2) {
                            input = 0;


                        }

                        if (input == 3) {
                            input = 0;
                            trainerMenu = false;
                        }

                        if (input > 3) {
                            input = 0;
                            System.out.println("You need to choose a menu-point from 1 - 4");
                            System.out.println();
                        }
                    }
                }
                if (input == 3) {
                    boolean cashiermenu = true;
                    while (cashiermenu) {
                        System.out.println("Welcome Cashier");
                        System.out.println("1: Show arrears");
                        System.out.println("2: Change arrears");
                        System.out.println("3: Back to main manu");
                        input = scan.nextInt();

                        if (input == 1) {
                            for (Swimmer s : swimmerList) {
                                System.out.println(s.name + " owes = " + s.contingent);
                            }

                        }
                        if (input == 2) {
                            System.out.println("What name do you want to override contingent");
                            String name = scan.next();
                            System.out.println("What is the new contingent");
                            int contingent = scan.nextInt();
                            //loop genne liste og find svømmer (name)
                            //set ny contingent for peter
                            //for()
                        }


                        if (input == 3) {
                            input = 0;
                            cashiermenu = false;
                        } else if (input > 2) {
                            input = 0;
                            System.out.println("You need to choose a menu-point from 1 - 4");
                        }
                        System.out.println();
                    }


                }
                if (input == 4) {
                    System.out.println("Have nice day!");
                    System.out.println("Goodbye");
                    System.exit(0);
                }

                if (input > 5) {
                    System.out.println("You need to choose a menu-point from 1 - 5, try again");
                    System.out.println("");
                }
            }
        }
    }
        private static void mainmenu()
        {
            System.out.println("Welcome to Delfinen Choose your account");
            System.out.println("(1. ---Chairman---)");
            System.out.println("(2. ---Trainer---)");
            System.out.println("(3. ---Cashier---)");
            System.out.println("(4. ---Close Program---)");
            input = scan.nextInt();
        }


}