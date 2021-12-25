import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        //running the menu.
        while (true) {
            Authenticate authenticate = new Authenticate();
            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);
            String name;
            String password;
            int choice = 0;
            int choice1;

            System.out.println("\n1 Enter as customer.");
            System.out.println("2 Enter as manager.");
            System.out.println("3 report emergency");
            System.out.println("4 Exit");
            System.out.print("Enter choice: ");
            choice1 = scanner.nextInt();


            if (choice1 == 1) {

                System.out.print("Enter Customer's username: ");
                name = scanner1.nextLine();

                System.out.print("Enter password: ");
                password = scanner1.nextLine();

                //authenticating customer and opening his account.
                if (authenticate.authenticateCustomer(name, password)) {
                    System.out.println("Login Successful.\n");

                    while (choice != 5) {
                        System.out.println("1 Book Car");
                        System.out.println("2 return Car");
                        System.out.println("3 Give Feedback");
                        System.out.println("4 Launch Complaint");
                        System.out.println("5 Logout");
                        System.out.println("Enter choice: ");
                        choice = scanner.nextInt();

                        if (choice == 1) {
                            BookCar_Handler bookCar_handler = new BookCar_Handler();
                            bookCar_handler.BookCar();

                        } else if (choice == 2) {
                            RecieptHandler recieptHandler = new RecieptHandler();
                            recieptHandler.returnSlip();
                            System.out.flush();

                        } else if (choice == 3) {
                            GiveFeedbackHandler GiveFeedback = new GiveFeedbackHandler();
                            GiveFeedback.giveFeedback();
                            System.out.flush();

                        } else if (choice == 4) {
                            LaunchComplaintHandler launchComplaintHandler = new LaunchComplaintHandler();
                            launchComplaintHandler.LaunchComplaint();
                            System.out.flush();
                        }


                    }

                } else {
                    System.out.println("Invalid Credentials.");
                }

            }
            if (choice1 == 2) {

                System.out.print("Enter manager username: ");
                name = scanner1.nextLine();

                System.out.print("Enter your password: ");
                password = scanner1.nextLine();

                //authenticating manager.
                if (authenticate.authenticateManager(name, password)) {
                    while (choice != 4) {
                        System.out.println("1 Add car");
                        System.out.println("2 Remove car");
                        System.out.println("3 View Feedback");
                        System.out.println("4 Logout");

                        System.out.print("Enter choice: ");
                        choice = scanner.nextInt();


                        //calling handlers.
                        if (choice == 1) {
                            AddCarHandler addCarHandler = new AddCarHandler();
                            addCarHandler.AddCar();
                            System.out.flush();

                        } else if (choice == 2) {
                            returnCar_Handler returnCar_handler = new returnCar_Handler();
                            returnCar_handler.ReturnChit();
                            System.out.flush();

                        } else if (choice == 3) {
                            GiveFeedbackHandler giveFeedbackHandler = new GiveFeedbackHandler();
                            giveFeedbackHandler.viewFeedback();
                            System.out.flush();
                        }

                    }

                } else {
                    System.out.println("Invalid credentials.");
                }
            }

            if (choice1 == 3) {
                Report_Emergency emergency = new Report_Emergency();

                emergency.reportEmergency();
                System.out.flush();
            }
            if (choice1 == 4) {

                break;
            }
        }
    }
}
