package task3;

import java.util.*;

public class Services {
    private final FlightSchedule flightSchedule;

    public Services(FlightSchedule flightSchedule) {
        this.flightSchedule = flightSchedule;
    }

    public void incomes(final Calendar cal1, final Calendar cal2) {
        System.out.println(flightSchedule.calcTotalIncomeBetweenDates(cal1, cal2));
    }

    public void buyTickets(final int index, final Passenger passenger) {
        List<Flight> flights = flightSchedule.getFlightList();
        Flight flight = flights.get(index);
        flight.buyTicket(passenger);
    }

    public void cancelTicket(final int index) {
        List<Flight> flights = flightSchedule.getFlightList();
        Flight flight = flights.get(index);
        flight.cancelTicket(index);
    }

    public void editOriginAirport(final int index, final Airport airport) {
        List<Flight> flights = flightSchedule.getFlightList();
        Flight flight = flights.get(index);
        flight.editOriginAirport(airport);
    }

    public void editDestinationAirport(final int index, final Airport airport) {
        List<Flight> flights = flightSchedule.getFlightList();
        Flight flight = flights.get(index);
        flight.editDestinationAirport(airport);
    }

    public void editPlane(final int index, final Plane plane) {
        List<Flight> flights = flightSchedule.getFlightList();
        Flight flight = flights.get(index);
        flight.editPlane(plane);
    }

    public void editDepartureTime(final int index, final Calendar date) {
        List<Flight> flights = flightSchedule.getFlightList();
        Flight flight = flights.get(index);
        flight.editDepartureTime(date);
    }

    public void editPrice(final int index, final double price) {
        List<Flight> flights = flightSchedule.getFlightList();
        Flight flight = flights.get(index);
        flight.editPrice(price);
    }

}

