import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Car_Catalog extends Car
{
    private Car car;
    private String make;
    private int model;
    private int regNumber;
    private double rent;

    //getters and setters.
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public int getModel() {
        return model;
    }
    public void setModel(int model) {
        this.model = model;
    }
    public int getRegNumber() {
        return regNumber;
    }
    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }
    public double getRent() {
        return rent;
    }
    public void setRent(double rent) {
        this.rent = rent;
    }

    //show cars function to display the remaining cars.
    public void showCars() throws FileNotFoundException
    {
        File readFile = new File("Cars.txt");
        Scanner scanFile = new Scanner(readFile);
        int i = 1;
        System.out.println("...............Available Cars...............");
        while(scanFile.hasNextLine())
        {
            String cars_Data;

            cars_Data = scanFile.nextLine();
            System.out.println( i + " " + cars_Data);
            i++;
        }
    }
}
