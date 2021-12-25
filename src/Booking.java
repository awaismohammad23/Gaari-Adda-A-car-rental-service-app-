import java.io.*;
import java.util.Scanner;

public class Booking
{
    //data members.
    private int CustomerID;
    private int BookingID;
    private double paidAmount;
    private Customer customer;
    private Payment payment;
    private Receipt receipt;

    //default constructor.
    Booking()
    {
        this.BookingID = 0;
        this.CustomerID = 0;
        this.paidAmount = 0.0;
    }

    //parameterized constructor.
    Booking(int id, int B_id, double amount)
    {
        this.CustomerID = id;
        this.BookingID = B_id;
        this.paidAmount = amount;
    }

    //setters and getters.
    public int getCustomerID() {
        return CustomerID;
    }
    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }
    public int getBookingID() {
        return BookingID;
    }
    public void setBookingID(int bookingID) {
        BookingID = bookingID;
    }
    public double getPaidAmount() {
        return paidAmount;
    }
    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Payment getPayment() {
        return payment;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    public Receipt getReceipt() {
        return receipt;
    }
    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    //adding the attributes in the booking file.
    public void writeIn(int B_ID,int C_ID, double amount,String name, int CarNumber) throws IOException {

        //creating a file writer.
        FileWriter myWriter = new FileWriter("Booking.txt", true);

        try {

            //adding the car into the stock.
            myWriter.write( B_ID + "," + C_ID + "," + amount + "," + name + "," + CarNumber + "\n");
            myWriter.close();

            System.out.println("Operation Successful.");

        } catch (IOException e)
        {
            System.out.println("Sorry cannot add booking.");
            e.printStackTrace();
        }
        finally {

            myWriter.close();
        }
    }

    //select desired car function.
    public void selectDesiredCar() throws IOException
    {
        int Car_ID;
        int C_ID;
        String name;
        double amount;
        int Car_Reg_Num;

        Car_Catalog car_catalog = new Car_Catalog();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        //showing the available cars to the customer.
        car_catalog.showCars();

        System.out.print("Select the desired car ID: ");
        Car_ID = scanner.nextInt();

        System.out.print("Enter customer ID: ");
        C_ID = scanner.nextInt();

        System.out.print("Enter customer name: ");
        name = scanner1.nextLine();

        System.out.print("Enter the total amount: ");
        amount = scanner.nextDouble();

        System.out.print("Enter the car number: ");
        Car_Reg_Num = scanner.nextInt();

        writeIn(Car_ID,C_ID,amount,name,Car_Reg_Num);

    }

    //make payment function
    public void makePayment(double amount)
    {
        payment.makePayment(amount);
    }

    //returning the booking chit of the customer after adding it to the booking information.
    public void generateBookingChit() throws IOException
    {
        //printing the last line present in the booking file.
        BufferedReader input = new BufferedReader(new FileReader("Booking.txt"));
        String last = null, line;

        while ((line = input.readLine()) != null)
        {
            last = line;
        }

        System.out.println(last);
    }
}
