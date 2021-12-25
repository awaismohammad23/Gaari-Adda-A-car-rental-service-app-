import java.io.IOException;

public class LaunchComplaintHandler
{
    private Complaint complaint = new Complaint();
    private Customer customer = new Customer();
    private Receipt receipt = new Receipt();

    //launch complaint function.
    public void LaunchComplaint() throws IOException
    {
        complaint.LaunchComplaint();
        receipt.generateComplaintSlip();
    }

}
