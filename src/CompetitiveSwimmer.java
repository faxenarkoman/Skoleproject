public class CompetitiveSwimmer extends Swimmer
{
    double bestSwimmingResults;
    int date;

    public CompetitiveSwimmer(int membership, int age, String name, String formOfActivity, boolean status, boolean ageGroup, boolean trainingLevel, double bestSwimmingResults, bestSwimming int date)
    {
        // Find en måde at få scanner til at oprette en instans af objekt
        super(membership, age, name, formOfActivity, status, ageGroup, trainingLevel);
            this.bestSwimmingResults = bestSwimmingResults;
            this.date = date;
    }
    public void results()
    {
        System.out.println(name + bestSwimmingResults + date);
    }

    public void top5()
    {
        System.out.println("The swimmers with the best times are as following");
        System.out.println(name + bestSwimmingResults);
    }
}

