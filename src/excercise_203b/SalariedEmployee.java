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
    double earning()
    {
        return weeklySalary;
    }

    @Override
    public String toString()
    {
        return super.getFirstName() + " " + super.getLastName()
                + " Social security number: " + super.getSsn()
                + " Weekly salary: " + earning();
    }
}
