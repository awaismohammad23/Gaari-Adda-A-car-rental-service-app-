import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Receipt
{
    private double paidAmount;

    //setters and getters
    public double getPaidAmount() {
        return paidAmount;
    }
    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }


    public void generatePaymentSlip()
    {
        System.out.println("Paid Amount: " + paidAmount);
    }

    public void returnSlip()
    {
        System.out.println("Car returned successfully.");
    }

    //generating the complaint slip.
    public void generateComplaintSlip() throws FileNotFoundException
    {
        FileReader myReader = new FileReader("Complaint.txt");
        Scanner myScanner = new Scanner(myReader);

        System.out.println("\n\n...............Complaint...............");
        while(myScanner.hasNextLine())
        {
            String data = myScanner.nextLine();
            System.out.println(data);
        }
    }
}
