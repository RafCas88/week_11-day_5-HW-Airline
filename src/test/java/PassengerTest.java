import org.junit.Before;
import org.junit.Test;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Alessandro", 2);
    }

    @Test
    public void hasName(){
        passenger.getName();
    }

    @Test
    public void hasNumberOfBags(){
        passenger.getNumberOfBags();
    }
}
