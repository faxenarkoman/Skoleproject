public class Swimmer
{
    int membership;
    int age;
    String name;
    String formOfActivity;

    boolean active, passive;

    boolean junior, senior;

    boolean excerciser, competitive;


    public Swimmer(int membership, int age, String name, String formOfActivity)
    {
        System.out.println("Give information of Swimmers: int membership, int age, String name, String formOfActivity");
        //scanner
        this.membership = membership;
        this.age  = age;
        this.name = name;
        this.formOfActivity = formOfActivity;
    }


}
