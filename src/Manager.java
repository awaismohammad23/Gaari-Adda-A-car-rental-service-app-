import java.io.*;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Manager
{
    private String name;
    private String key;
    private String Address;

    //setters and getters.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }

    //writes customers data in customers.txt file.
    void writeManager(String name, String key, String address) throws IOException {

        FileWriter myWriter = new FileWriter("Manager.txt", true);

        try {

            //adding the car into the stock.
            myWriter.write(name + "," + key + "," + address + "\n");
            myWriter.close();

            System.out.println("Manager added successfully.");

        } catch (IOException e)
        {
            System.out.println("Sorry cannot add Manager.");
            e.printStackTrace();
        } finally
        {
            myWriter.close();
        }

    }

    //addCar function.
    public void addCar() throws IOException
    {
        String name;
        String make;
        int model;
        String colour;
        String type;
        double Price;

        //taking input from user.
        Scanner input = new Scanner(System.in);
        Scanner data = new Scanner(System.in);

        System.out.print("Enter the name of the car: ");
        name = input.nextLine();

        System.out.print("Enter the make of the car: ");
        make = input.nextLine();

        System.out.print("Enter the model of the car: ");
        model = input.nextInt();

        System.out.print("Enter the price of the car: ");
        Price = input.nextDouble();

        System.out.print("Enter the colour of the car: ");
        colour = data.nextLine();

        System.out.print("Enter the type of the car: ");
        type = data.nextLine();

        //writing the data into the file.
        FileWriter myWriter = new FileWriter("Cars.txt", true);

        try {

            //adding the car into the stock.
            myWriter.write(name + "," + make + "," + model + "," + colour + "," + type + "," + Price + "\n");
            myWriter.close();


        } catch (IOException e)
        {
            System.out.println("Sorry cannot add a car.");
            e.printStackTrace();

        } finally
        {
            myWriter.close();
        }
    }

    //remove car function.
    public void removeCar() throws IOException
    {
        String name;
        String make;
        int model;
        String colour;
        String type;
        double Price;

        //taking input from user.
        Scanner input = new Scanner(System.in);
        Scanner data = new Scanner(System.in);

        System.out.print("Enter the name of the car: ");
        name = input.nextLine();

        System.out.print("Enter the make of the car: ");
        make = input.nextLine();

        System.out.print("Enter the model of the car: ");
        model = input.nextInt();

        System.out.print("Enter the price of the car: ");
        Price = input.nextDouble();

        System.out.print("Enter the colour of the car: ");
        colour = data.nextLine();

        System.out.print("Enter the type of the car: ");
        type = data.nextLine();

        String tempStr = name + "," + make + "," + model + "," + colour + "," + type + "," + Price + "\n";

        // PrintWriter object for output.txt
        PrintWriter PrintWriter = new PrintWriter("Cars.txt");

        // BufferedReader object for input.txt
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Cars.txt"));

        String line1 = bufferedReader.readLine();

        // loop for each line of input.txt
        while (line1 != null) {
            boolean flag = false;

            // BufferedReader object for delete.txt
            BufferedReader bufferedReader1 = new BufferedReader(new FileReader("Cars.txt"));

            String line2 = bufferedReader1.readLine();

            while (line2 != null)
            {
                if (line1.equals(line2))
                {
                    flag = true;
                    break;
                }

                line2 = bufferedReader1.readLine();
            }

            if (!flag)
            {
                PrintWriter.println(line1);
            }
            else
            {
                line1 = bufferedReader.readLine();
            }


        }

        PrintWriter.flush();

        bufferedReader.close();
        PrintWriter.close();
    }

    //view complaint function.
    public void viewComplaints() throws FileNotFoundException {
        Complaint complaint = new Complaint();

        //calling the show complaint function.
        complaint.showComplaint();
    }

    //view feedback function.
    public  void viewFeedback() throws FileNotFoundException
    {
        Feedback feedback = new Feedback();

        //calling the show feedback function.
        feedback.showFeedback();
    }

}
