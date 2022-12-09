public class Swimmer implements Comparable<Swimmer>
{
    //Variables
    static int total = 0;
    int id;
    int contingent;
    int age;
    String name;
    String formOfActivity;
    boolean status;

    boolean ageGroup;

    boolean trainingLevel;

    //Getters and Setters

    public String getName()
    {
        return name;
    }
    public int getId()
    {
        return id;
    }

    //Constructor
    public Swimmer( String name, int age, int contingent, String formOfActivity, boolean status, boolean ageGroup, boolean trainingLevel)
    {
        total++;
        this.id = total;
        this.name = name;
        this.age  = age;
        this.contingent = contingent;
        this.formOfActivity = formOfActivity;
        this.status = status;
        this.ageGroup = ageGroup;
        this.trainingLevel = trainingLevel;
    }
    //Everything else
    public boolean isStatus()
    {
        return status;
    }

    public boolean isAgeGroup()
    {
        return ageGroup;
    }
    public boolean isTrainingLevel()
    {
        return trainingLevel;
    }
    public String toString()
    {
        return "\n[Swimmer: " + id + ", " + name +", "+ age +" Years, "+ "this is the contingent: " + contingent + ", Form of Activity: " + formOfActivity + "]";
    }

    @Override
    public int compareTo(Swimmer o)
    {
        if (this instanceof CompetitiveSwimmer)
        {
            if (o instanceof CompetitiveSwimmer)
            {
                if (((CompetitiveSwimmer) this).getBestSwimmingResults() < ((CompetitiveSwimmer) o).getBestSwimmingResults())
                {
                    return -1;
                }
                else
                {
                    return 1;
                }
            }
            else
            {
                return -1;
            }
        }
        else
        {
            return 1;
        }
    }
}
