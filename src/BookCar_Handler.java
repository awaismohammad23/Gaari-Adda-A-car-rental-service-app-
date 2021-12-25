import java.io.IOException;

public class BookCar_Handler
{
    private Booking booking = new Booking();

    public void BookCar() throws IOException
    {
        booking.selectDesiredCar();
    }
}
