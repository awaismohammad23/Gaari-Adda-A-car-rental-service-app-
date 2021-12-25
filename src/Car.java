public class Car
{
    private boolean bookingStatus;

    //setters and getters.
    public boolean isBookingStatus() {
        return bookingStatus;
    }
    public void setBookingStatus(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    //default constructor.
    Car()
    {
        bookingStatus = false;
    }

    //parameterized constructor.
    Car(boolean status)
    {
        this.bookingStatus = status;
    }
}
