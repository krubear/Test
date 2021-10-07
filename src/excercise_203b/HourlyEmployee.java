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
    double earning()
    {
        return paymentPerHour * hoursWorkedPerWeek;

    }

    @Override
    public String toString()
    {

        return super.getFirstName() + " " + super.getLastName()
                + " Social security number: " + super.getSsn()
                + " Weekly salary: " + earning();
    }

}
