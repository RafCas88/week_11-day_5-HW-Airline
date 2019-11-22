import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(
            Plane plane,
            String flightNumber,
            String destination,
            String departureAirport,
            String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int getNumberOfAvailableSeats(){
        ArrayList<Passenger> availableSeats = new ArrayList<Passenger>();
        for (Passenger passenger :this.passengers){
            if(passenger.passengerCount() == 0){
                availableSeats.add(passenger);
            }
        }
        return availableSeats;
    }
}
