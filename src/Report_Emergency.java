import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Report_Emergency
{
    private Customer customer;

    public void reportEmergency() throws IOException
    {

        String Emergency;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Emergency: ");
        Emergency = scanner.nextLine();

        FileWriter myWriter = new FileWriter("Emergency.txt");

        myWriter.write(Emergency + "\n");
        System.out.println("Emergency reported you will be contacted soon.");

    }

}
