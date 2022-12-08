public class CompetitiveSwimmer extends Swimmer
{
    public double getBestSwimmingResults() {
        return bestSwimmingResults;
    }

    public void setBestSwimmingResults(double bestSwimmingResults) {
        this.bestSwimmingResults = bestSwimmingResults;
    }

    double bestSwimmingResults = 0.0;
    int date;
    int id;

      public CompetitiveSwimmer(int id, String name, int age, int contingent, String formOfActivity, boolean status, boolean ageGroup, boolean trainingLevel, double bestSwimmingResults, int date)
    {
        // Find en måde at få scanner til at oprette en instans af objekt
        super(id, name, age, contingent, formOfActivity, status, ageGroup, trainingLevel);
            this.bestSwimmingResults = bestSwimmingResults;
            this.date = date;
            this.id = id;
    }
    public void results()
    {
        System.out.println(name + bestSwimmingResults + date);
    }


}

