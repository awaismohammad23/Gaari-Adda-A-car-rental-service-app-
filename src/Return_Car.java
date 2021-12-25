public class Return_Car
{
    private Customer customer;
    private Receipt receipt;

    //setters and getters.
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Receipt getReceipt() {
        return receipt;
    }
    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    //functions.
    public void returnChit()
    {
        receipt.returnSlip();
    }
}
