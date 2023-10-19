package task3;

import java.util.*;

public class Flight {
//    private Long id;
    private Airport originAirport;
    private Airport destinationAirport;
    private Calendar departureTime;
    private Plane plane;
    private List<Ticket> tickets;
    private List<Passenger> passengers;
    private double price;

        public Flight(Airport originAirport, Airport destinationAirport, Calendar departureTime,
                  Plane plane, double price) {
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
        this.plane = plane;
        this.tickets = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.price = price;
    }

    public Calendar getDepartureTime() {
        return departureTime;
    }

    public double incomeByFlight() {
        return price * tickets.size();
    }
    public void editOriginAirport(final Airport airport) {
        this.originAirport = airport;
    }

    public void editDestinationAirport(final Airport airport) {
        this.destinationAirport = airport;
    }

    public void editPrice(final double price) {
        this.price = price;
    }

    public void editPlane(final Plane plane) {
        this.plane = plane;
    }
    public void editDepartureTime(final Calendar departureTime) {
        this.departureTime = departureTime;
    }
    public void buyTicket(final Passenger passenger) {
        tickets.add(new Ticket(passenger));
        passengers.add(passenger);
    }

    public void cancelTicket(final int index) {
        tickets.remove(index);
        passengers.remove(index);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "originAirport=" + originAirport +
                ", destinationAirport=" + destinationAirport +
                ", departureTime=" + departureTime.getTime() +
                ", plane=" + plane +
                ", tickets=" + tickets +
                ", passengers=" + passengers +
                ", price=" + price +
                '}';
    }
}
