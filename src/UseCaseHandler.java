import java.io.IOException;

public class UseCaseHandler
{
    //private data members.
    private Customer customer;
    private Manager manager;
    private BookCar_Handler bookCar_handler;
    private AddCarHandler addCarHandler;
    private GiveFeedbackHandler feedbackHandler;
    private LaunchComplaintHandler complaintHandler;
    private returnCar_Handler returnCarHandler;
    private Report_Emergency_Handler report_emergency;
    //functions.
    public void bookCarCaller() throws IOException
    {
        bookCar_handler.BookCar();;
    }

    //add car caller.
    public void addCarCaller() throws IOException
    {
        addCarHandler.AddCar();
    }

    //return car caller.
    public void feedbackCaller() throws IOException
    {
        feedbackHandler.giveFeedback();
    }

    public void launchComplaint() throws IOException
    {
      complaintHandler.LaunchComplaint();
    }

    public void returnCar()
    {
        returnCarHandler.ReturnChit();
    }

    //reporting emergency.
    public void reportEmergency() throws IOException
    {
        report_emergency.reportEmergency();
    }
}
