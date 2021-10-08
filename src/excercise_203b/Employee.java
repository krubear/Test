package excercise_203b;

public abstract class Employee implements IPayable
{

    private final String firstName;
    private final String lastName;
    private final long ssn;

    Employee(String firstName, String lastName, long ssn)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    @Override
    public String toString()
    {
        return "Employee: " + firstName + " " + lastName + "\n Social security number: " + ssn;
    }

    @Override
    public abstract double getPaymentAmount();

    abstract double earning();

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public long getSsn()
    {
        return ssn;
    }

}
