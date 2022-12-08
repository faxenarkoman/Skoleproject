import java.util.Comparator;

public class Swimmer
{
    public void setId(int id) {
        this.id = id++;
    }

    private int id;
    int contingent;
    int age;

    public String getName() {
        return name;
    }

    String name;
    String formOfActivity;

    // find en metode til at implementer til hvert objekt

    public int getId()
    {
        return id;
    }



    public boolean isStatus()

    {
        return status;
    }

    public boolean isAgeGroup()
    {
        return ageGroup;
    }

    public boolean isTraningLevel()
    {
        return traningLevel;
    }

    boolean status;

    boolean ageGroup;

    boolean traningLevel;

    public Swimmer()
    {

    }














    public Swimmer(int id, String name, int age, int contingent, String formOfActivity, boolean status, boolean ageGroup, boolean trainingLevel)
    {
        //System.out.println("Give information of Swimmers: int membership, int age, String name, String formOfActivity, boolean status = true, boolean junior = true, boolean exerciser = true");
        //scanner
        this.id = id;
        this.name = name;
        this.age  = age;
        this.contingent = contingent;
        this.formOfActivity = formOfActivity;
        this.status = status;
        this.ageGroup = ageGroup;
        this.traningLevel = trainingLevel;


    }


    public String toString()
    {
        return "Swimmer: " + id + ", " + name +", "+ age +" Years, "+ "this is the contingent: " + contingent + ", Form of Activity: " + formOfActivity;
    }



}
