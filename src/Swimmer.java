

public class Swimmer
{
    int membership;
    int age;
    String name;
    String formOfActivity;

    // find en metode til at implementer til hvert objekt
    boolean status;
    boolean junior = true, senior = false;
    boolean exerciser = true, competitive = false;


    public Swimmer(int membership, int age, String name, String formOfActivity, boolean status, boolean junior, boolean exerciser)
    {
        System.out.println("Give information of Swimmers: int membership, int age, String name, String formOfActivity, boolean status = true, boolean junior = true, boolean exerciser = true");
        //scanner
        this.membership = membership;
        this.age  = age;
        this.name = name;
        this.formOfActivity = formOfActivity;
        this.status = status;
        this.junior = junior;
        this.exerciser = exerciser;
    }

    public String toString()
    {
        String text = "";
        
        if (status = false)
            return "im a Exerciser";

        if (status = true)
            return "im a Competetive swimmer";
    }

}
