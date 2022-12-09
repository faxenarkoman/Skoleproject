import java.util.Comparator;

public class Swimmer implements Comparable<Swimmer>
{
    private void setId(int id) {
        total++;
        this.id = total;
    }

    static int total = 0;
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


    public Swimmer(String name, int age, int contingent, String formOfActivity, boolean status, boolean ageGroup, boolean trainingLevel)
    {
        total++;
        this.id = total;
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
