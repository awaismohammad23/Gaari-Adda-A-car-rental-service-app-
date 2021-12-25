import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Complaint
{
    private String complaint;

    //setters and getters.
    public String getComplaint() {
        return complaint;
    }

    //setting complaint in the file.
    public void setComplaint(String complaint) throws IOException
    {
        this.complaint = complaint;
    }

    //taking complaint from the user and storing it in file.
    public void LaunchComplaint() throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        String complaint = null;

        FileWriter myWriter = new FileWriter("Complaint.txt");

        System.out.print("Enter your complaint: ");
        complaint = scanner.nextLine();
        //writing complaint in the file.
        myWriter.write(complaint);

        System.out.println("Complaint launched successfully.");
        myWriter.close();
    }

    //display function of complaints from the file.
    public void showComplaint() throws FileNotFoundException
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
