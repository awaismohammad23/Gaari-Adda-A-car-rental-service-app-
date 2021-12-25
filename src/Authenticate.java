import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Authenticate
{

    private String name;
    private String password;

    //setters and getters.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    //authenticates a user.
    public boolean authenticateCustomer(String name, String password) throws FileNotFoundException {
        File myFile = new File("Customers.txt");
        FileReader myReader = new FileReader("Customers.txt");
        Scanner scanner = new Scanner(myReader);
        String userName = "";
        String Password = "";

        while (scanner.hasNextLine())
        {
            String lineFile = scanner.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(lineFile, ",");
            int counter = 0;

            while (stringTokenizer.hasMoreTokens())
            {
                if (counter == 1) {
                    userName = stringTokenizer.nextToken();
                    counter++;
                    continue;
                }
                if (counter == 2) {
                    Password = stringTokenizer.nextToken();
                    counter++;
                    break;
                }

                stringTokenizer.nextToken();
                counter++;
            }

            if (userName.compareTo(name) == 0 && Password.compareTo(password) == 0) {
                return true;
            }
        }

        return false;
    }

    //authenticate Manager
    public boolean authenticateManager(String name, String password) throws FileNotFoundException
    {
        File myFile = new File("Manager.txt");
        FileReader myReader = new FileReader("Manager.txt");
        Scanner scanner = new Scanner(myReader);
        String userName = "";
        String Password = "";

        while (scanner.hasNextLine())
        {
            String lineFile = scanner.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(lineFile, ",");
            int counter = 0;

            while (stringTokenizer.hasMoreTokens()) {
                if (counter == 0) {
                    userName = stringTokenizer.nextToken();
                    counter++;
                }
                if (counter == 1) {
                    Password = stringTokenizer.nextToken();
                    counter++;
                    break;
                }

                stringTokenizer.nextToken();
                counter++;
            }

            //checking whether the manager exists or not.
            if (userName.compareTo(name) == 0 && Password.compareTo(password) == 0)
            {
                return true;
            }

        }

        return false;
    }
}
