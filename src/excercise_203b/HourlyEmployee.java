package excercise_203b;

public class HourlyEmployee extends Employee
{
    
    private double hoursWorkedPerWeek;
    private double paymentPerHour;

    HourlyEmployee(String firstName, String lastName, long ssn,
            double hoursWorkedPerWeek, double paymentPerHour)
    {

        super(firstName, lastName, ssn);
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
        this.paymentPerHour = paymentPerHour;
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
        return paymentPerHour * hoursWorkedPerWeek;
    }

    @Override
    public String toString()
    {
        return super.getFirstName() + " " + super.getLastName()
                + "\nSocial security number: " + super.getSsn()
                + "\nWeekly salary: " + earning() +"\n";
    }
    
    @Override
    public double totalCost()
    {
        return earning() * 4;
    }

}
