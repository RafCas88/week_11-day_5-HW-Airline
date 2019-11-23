import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(
            ArrayList<Passenger> passengers,
            String flightNumber,
            String destination,
            String departureAirport,
            String departureTime){
        this.passengers = passengers;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }


//    public int getNumberOfAvailableSeats(){
//        ArrayList<Passenger> availableSeats = new ArrayList<Passenger>();
//        for (Passenger passenger :this.passengers){
//            if(passenger.passengerCount() == 0){
//                availableSeats.add(passenger);
//            }
//        }
//        return availableSeats;
//    }
}
