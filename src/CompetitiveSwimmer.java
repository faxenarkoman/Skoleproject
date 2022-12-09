public class CompetitiveSwimmer extends Swimmer
{
    double bestSwimmingResults;
    //Getters and Setters
    public double getBestSwimmingResults()
    {
        return this.bestSwimmingResults;
    }
    public void setBestSwimmingResults(double bestSwimmingResults)
    {
        this.bestSwimmingResults = bestSwimmingResults;
    }
    //Constructors

      public CompetitiveSwimmer(String name, int age, int contingent, String formOfActivity, boolean status, boolean ageGroup, boolean trainingLevel, double bestSwimmingResults)
    {
        super(name, age, contingent, formOfActivity, status, ageGroup, trainingLevel);
            this.bestSwimmingResults = bestSwimmingResults;
    }
    //toString
    public String toString()
    {
        return "\n[Competitive Swimmer: " + name + ", " + getId() +", " + "Best Time: " + bestSwimmingResults + "]";
    }

}

