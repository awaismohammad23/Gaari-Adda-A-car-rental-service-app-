import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Feedback
{

    private String feedback;

    //setters and getters.
    public String getFeedback() {
        return feedback;
    }
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    //getting feedback from the user and storing in the file.
    public void giveFeedback(String feedback) throws IOException {
        //writing feedback in a file.
        //creating a file writer.

        setFeedback(feedback);
        
        FileWriter myWriter = new FileWriter("Feedback.txt", true);

        try {

            //adding the car into the stock.
            myWriter.write(feedback + "\n");
            myWriter.close();

            System.out.println("Feedback submitted successfully.");

        } catch (IOException e)
        {
            System.out.println("Sorry cannot add feedback.");
            e.printStackTrace();
        }
        finally {

            myWriter.close();
        }
    }

    //show feedback function.
    public void showFeedback() throws FileNotFoundException
    {
        FileReader myReader = new FileReader("Feedback.txt");
        Scanner myScanner = new Scanner(myReader);

        System.out.println("\n\n...............Feedback...............");
        while(myScanner.hasNextLine())
        {
            String data = myScanner.nextLine();
            System.out.println(data);
        }
    }
}
