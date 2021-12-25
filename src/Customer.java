import java.io.FileWriter;
import java.io.IOException;

public class Customer
{
    private String name;
    private int ID;
    private String Password;
    private String address;

    //setters and getters.
    public String getName()
    {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    //writes customers data in customers.txt file.
    void writeCustomer(String name, int ID, String password, String address) throws IOException {

        FileWriter myWriter = new FileWriter("Customers.txt",true);

        try {

            //adding the car into the stock.
            myWriter.write(ID + "," + name + "," + password + "," + address + "\n");
            myWriter.close();

            System.out.println("Customer added successfully.");

        } catch (IOException e)
        {
            System.out.println("Sorry cannot add Manager.");
            e.printStackTrace();
        }
        finally {

            myWriter.close();
        }

    }
}
