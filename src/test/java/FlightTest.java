import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger passenger;
    private Plane plane;

    @Before
    public void before(){

        ArrayList<Passenger> passengers = new ArrayList<Passenger>();

        flight = new Flight(
                passengers,
                "FR756",
                "GLA",
                "EDI",
                "10:00");

        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void flightStartsEmpty(){
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.passengerCount());

    }
}
