public class Swimmer
{
    int contingent;
    int age;
    String name;
    String formOfActivity;

    // find en metode til at implementer til hvert objekt


    public boolean isStatus()
    {
        return status;
    }

    boolean status;

    boolean ageGroup;

    boolean traningLevel;


    public Swimmer(int contingent, int age, String name, String formOfActivity, boolean status, boolean ageGroup, boolean trainingLevel)
    {
        //System.out.println("Give information of Swimmers: int membership, int age, String name, String formOfActivity, boolean status = true, boolean junior = true, boolean exerciser = true");
        //scanner
        this.contingent = contingent;
        this.age  = age;
        this.name = name;
        this.formOfActivity = formOfActivity;
        this.status = status;
        this.ageGroup = ageGroup;
        this.traningLevel = trainingLevel;


    }


    public String toString()
    {
        return "Swimmer: " + "this is the contigent: " + contingent +", "+ age +", "+ name + ", " + formOfActivity;
    }
}
