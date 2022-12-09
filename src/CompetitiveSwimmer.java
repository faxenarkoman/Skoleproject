import java.util.Comparator;
import java.util.function.ToDoubleFunction;

public class CompetitiveSwimmer extends Swimmer
{
    public double getBestSwimmingResults() {
        return this.bestSwimmingResults;
    }

    public void setBestSwimmingResults(double bestSwimmingResults) {
        this.bestSwimmingResults = bestSwimmingResults;
    }

    double bestSwimmingResults = 0.0;
    int date;

      public CompetitiveSwimmer(String name, int age, int contingent, String formOfActivity, boolean status, boolean ageGroup, boolean trainingLevel, double bestSwimmingResults)
    {
        // Find en måde at få scanner til at oprette en instans af objekt
        super(name, age, contingent, formOfActivity, status, ageGroup, trainingLevel);
            this.bestSwimmingResults = bestSwimmingResults;
    }
    public void results()
    {
        System.out.println(name + bestSwimmingResults + date);
    }

    public CompetitiveSwimmer()
    {
        super();

    }
    public String toString()
    {
        return "\n[Swimmer: " + getId() + ", " + name +", " + bestSwimmingResults + "]";
    }

}

