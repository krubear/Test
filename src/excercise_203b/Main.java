package excercise_203b;

public class Main
{

    public static void main(String[] args)
    {
        HourlyEmployee torkild = new HourlyEmployee("Torkild", "Kruber", 199309152511L, 16, 170);
        SalariedEmployee sanjin = new SalariedEmployee("Sanjin", "Lihovic", 198607023411L, 3000);

        System.out.println(torkild.toString());
        System.out.println(sanjin.toString());
    }

}
