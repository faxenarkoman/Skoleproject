import java.util.*;
public class Main {
    static int input = 0;
    static Scanner scan;

    public static void main(String[] args)
    {
       
        CompetitiveSwimmer cp = new CompetitiveSwimmer("Peter", 20, 1600, "Crawl", true, true, true, 55.1);
        ArrayList<Swimmer> swimmerList = new ArrayList<>();
        swimmerList.add(new Swimmer("Patric", 16, 1000, "breaststroke", true, false, true));
        swimmerList.add(new Swimmer("Louise", 18, 1600, "butterfly", true, true, true));
        swimmerList.add(new CompetitiveSwimmer("Peter", 20, 1600, "Crawl", true, true, true, 55.1));
        swimmerList.add(new Swimmer("Ole", 65, 500, "Just chilling in the kids pool", false, false, false));
        swimmerList.add(new Swimmer("Ahmed", 45, 500, "Chilling in the jacuzzi", false, false, false));
        swimmerList.add(new CompetitiveSwimmer("Jens", 18, 1600, "Crawl", true, true, true, 51.5));
        swimmerList.add(new CompetitiveSwimmer("Martin", 19, 1600, "butterfly", true, true, true, 56.6));
        swimmerList.add(new CompetitiveSwimmer("Borat", 19, 1600, "butterfly", true, true, true, 56.7));
        swimmerList.add(new CompetitiveSwimmer("Karl", 19, 1600, "butterfly", true, true, true, 20.1));


        scan = new Scanner(System.in);
        boolean goReturn = true;
        while(goReturn) {
            mainMenu();
            if (input == 1) {
                input = 0;
                boolean chairmanMenu = true;
                while (chairmanMenu) {
                    System.out.println("Hello Chairman, how do you want to proceed?");
                    System.out.println("1: Log new member");
                    System.out.println("2: See all members");
                    System.out.println("3: Back to menu");
                    input = scan.nextInt();

                    if (input == 1) {
                        input = 0;
                        boolean trainingLevel;
                        String name;
                        int age;
                        int contingent;
                        String formOfActivity;
                        boolean status;
                        boolean ageGroup;

                        System.out.println("Insert name");
                        name = scan.next();
                        System.out.println("Insert Age");
                        age = scan.nextInt();
                        System.out.println("Insert contingent");
                        contingent = scan.nextInt();
                        System.out.println("Insert form of activity");
                        formOfActivity = scan.next();
                        System.out.println("False = passive swimmer / True = swimmer");
                        status = scan.nextBoolean();
                        System.out.println("False = junior swimmer / True = senior swimmer");
                        ageGroup = scan.nextBoolean();
                        System.out.println("False = exerciser / True = competitive swimmer");
                        trainingLevel = scan.nextBoolean();

                        double bestSwimmingResults = 0.0;



                        if (trainingLevel) {
                            swimmerList.add(new CompetitiveSwimmer(name, age, contingent, formOfActivity, status, ageGroup, true, bestSwimmingResults));
                        } 
                        else 
                        {
                            swimmerList.add(new Swimmer(name, age, contingent, formOfActivity, status, ageGroup, false));
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

                    if (input > 4) {
                        input = 0;
                        System.out.println("You need to choose a menu-point from 1 - 3");
                        System.out.println();
                    }

                    if (input == 3) {
                        input = 0;
                        chairmanMenu = false;
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
                        for (int i = 0; i < swimmerList.size(); i++)
                        {

                            System.out.println("What is the ID of the person which you want to log new best time");
                            int j = scan.nextInt();
                            CompetitiveSwimmer swimmer = (CompetitiveSwimmer) swimmerList.get(j);
                            System.out.println("You Chose " + swimmer.getName());
                            System.out.println("What is the new personal record");
                            double doubleInput = scan.nextDouble();
                            swimmer.setBestSwimmingResults(doubleInput);
                            System.out.println(swimmer.getName() + "(s) best time is: " + swimmer.getBestSwimmingResults());
                        }
                    }

                    if (input == 2)
                    {
                        input = 0;
                        //CompetitiveSwimmer cp = new CompetitiveSwimmer();
                        for (int i = 0; i < swimmerList.size(); i++)
                        {
                            swimmerList.sort(Comparator.comparing(Swimmer -> cp.getBestSwimmingResults()));
                            System.out.println(cp.getName() + " " + cp.getBestSwimmingResults());
                            System.out.println();
                        }

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
                boolean cashierMenu = true;
                while (cashierMenu) {
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
                        System.out.println("Witch id do you want to override contingent");
                        int id = scan.nextInt();
                        System.out.println("What is the new contingent");
                        int contingent = scan.nextInt();

                        Swimmer searchResult = null;
                        for (Swimmer s : swimmerList) {
                            if (s.getId() == id) {
                                searchResult = s;
                                break;
                            }
                        }

                        if (searchResult == null)
                        {
                            System.out.println("Name doesn't exist");
                        } else
                        {
                            searchResult.contingent = contingent;
                        }


                    }


                    if (input == 3) {
                        input = 0;
                        cashierMenu = false;
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
                goReturn = false;
            }

            if (input > 5) {
                System.out.println("You need to choose a menu-point from 1 - 5, try again");
                System.out.println();
            }
        }
    }
        
    
    private static void mainMenu()
    {
        System.out.println("Welcome to Delfinen Choose your account");
        System.out.println("(1. ---Chairman---)");
        System.out.println("(2. ---Trainer---)");
        System.out.println("(3. ---Cashier---)");
        System.out.println("(4. ---Close Program---)");
        input = scan.nextInt();
    }
}