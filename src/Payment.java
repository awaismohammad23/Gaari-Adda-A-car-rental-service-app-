public class Payment
{
    private double dueAmount;
    private double paidAmount;

    //setters and getters.
    public double getDueAmount() {
        return dueAmount;
    }
    public void setDueAmount(double dueAmount) {
        this.dueAmount = dueAmount;
    }
    public double getPaidAmount() {
        return paidAmount;
    }
    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }

    //make payment function.
    public double makePayment(double amountPaid)
    {
        return amountPaid -= dueAmount;
    }
}
