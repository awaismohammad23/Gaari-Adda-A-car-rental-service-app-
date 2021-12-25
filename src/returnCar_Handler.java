public class returnCar_Handler
{
    private Customer customer = new Customer();
    private Car_Catalog car_catalog = new Car_Catalog();
    private Receipt receipt = new Receipt();

    public void ReturnChit()
    {
        receipt.returnSlip();
    }
}
