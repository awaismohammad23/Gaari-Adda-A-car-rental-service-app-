import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class GiveFeedbackHandler
{
    private Feedback feedback = new Feedback();
    private Customer customer = new Customer();
    private Receipt receipt = new Receipt();
    private Manager manager = new Manager();

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

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

    public void giveFeedback() throws IOException
    {
        String FeedBack = null;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your feedback: ");
        FeedBack = scanner.nextLine();

        feedback.giveFeedback(FeedBack);
    }

    public void viewFeedback() throws FileNotFoundException
    {
        manager.viewFeedback();
    }
}
