package excercise_203b;

public class Main
{

    public static void main(String[] args)
    {
        double totalCost = 0;
        
        HourlyEmployee hassan = new HourlyEmployee("Hassan", "Dilkrot", 197305152251L, 10, 100);
        SalariedEmployee bosse = new SalariedEmployee("Bosse", "Reburk", 198902023491L, 3000);
        Invoice bill1 = new Invoice("123456789", 7, 14);
        Invoice bill2 = new Invoice("987654321", 4, 3000);
        
        System.out.println(hassan.toString());
        System.out.println(bosse.toString());

        IPayable[] salariesExpenses = {hassan, bosse, bill1, bill2};

        for (IPayable salariesExpense : salariesExpenses)
        {
            totalCost += salariesExpense.totalCost();
            System.out.println(salariesExpense.getPaymentAmount());
            System.out.println("");
        }
        
        System.out.println("Total monthly cost: " + totalCost);
    }

}
