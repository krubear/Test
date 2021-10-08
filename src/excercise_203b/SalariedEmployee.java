package excercise_203b;

public class SalariedEmployee extends Employee
{
    
    double weeklySalary;

    SalariedEmployee(String firstName, String lastName, long ssn, double weeklySalary)
    {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount()
    {
        System.out.println(super.getFirstName() + " " + super.getLastName() 
                + " monthly salary: ");
        return earning() * 4;
    }

    @Override
    double earning()
    {
        return weeklySalary;
    }

    @Override
    public String toString()
    {
        return super.getFirstName() + " " + super.getLastName()
                + "\nSocial security number: " + super.getSsn()
                + "\nWeekly salary: " + earning() + "\n";
    }
    
    @Override
    public double totalCost()
    {
        return earning() * 4;
    }
}
