package excercise_203b;

class Invoice implements IPayable
{
    
    private String invoiceNumber;
    private int quantity;
    private double pricePerItem;

    Invoice(String invoiceNumber, int quantity, double pricePerItem)
    {
        this.invoiceNumber = invoiceNumber;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPaymentAmount()
    {
        System.out.println("Invoice nr: " + invoiceNumber);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per item: " + pricePerItem);
        System.out.print("Final sum: " );
        return quantity * pricePerItem;
    }
    
    @Override
    public double totalCost()
    {
        return quantity * pricePerItem;
    }
}
