package task3;

import java.util.*;

public class FlightSchedule {
    private final List<Flight> flightList;

    public FlightSchedule() {
        this.flightList = new ArrayList<>();
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void addToSchedule(final Flight flight) {
        flightList.add(flight);
    }

    public void editFlight(final int index, final Flight flight) {
        flightList.set(index, flight);
    }
    public void removeFlight(final int index) {
        flightList.remove(index);
    }
    public void displaySchedule() {
        for (final Flight flight : flightList) {
            System.out.println(flight);
        }
    }
    public double calcTotalIncomeBetweenDates(final Calendar cal1, final Calendar cal2) {
        Date from = cal1.getTime();
        Date to = cal2.getTime();
        double sum = 0;
        for(final Flight flight : flightList) {
            if(flight.getDepartureTime().getTime().after(from) && flight.getDepartureTime().getTime().before(to)) {
                sum += flight.incomeByFlight();
            }
        }
        return sum;
    }
}
