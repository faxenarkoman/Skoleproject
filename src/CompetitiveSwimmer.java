public class CompetitiveSwimmer extends Swimmer
{
    double bestSwimmingResults;
    int date;


      public CompetitiveSwimmer(String name, int age, int contingent, String formOfActivity, boolean status, boolean ageGroup, boolean trainingLevel, double bestSwimmingResults, int date)
    {
        // Find en måde at få scanner til at oprette en instans af objekt
        super(name, age, contingent, formOfActivity, status, ageGroup, trainingLevel);
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

