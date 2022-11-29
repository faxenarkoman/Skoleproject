public class CompetitiveSwimmer extends Swimmer
{
    double bestSwimmingResults;
    int date;

    public CompetitiveSwimmer(int membership, int age, String name, String formOfActivity, double bestSwimmingResults, int date)
    {
        super(membership, age, name, formOfActivity);
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

