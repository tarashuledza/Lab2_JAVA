package task3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Airport airport1 = new Airport("USA", "New York");
        Airport airport2 = new Airport("Japan", "Shibuya");
        Airport airport3 = new Airport("Ukraine", "Kyiv");
        Airport airport4 = new Airport("Poland", "Krakow");

        Calendar departureTime = new GregorianCalendar(2023, Calendar.OCTOBER, 19, 12, 45);
        Plane plane = new Plane("Boeing 747");
        Flight flight1 = new Flight(airport1, airport2, departureTime, plane, 500.0);

        Calendar departureTime2 = new GregorianCalendar(2023, Calendar.OCTOBER, 8, 18, 12);
        Plane plane2 = new Plane("Boeing 747");
        Flight flight2 = new Flight(airport3, airport4, departureTime2, plane2, 900.0);

        Passenger passenger1 = new Passenger("Taras Huledza", "tarashuledza14@gmail.com");
        Passenger passenger2 = new Passenger("Yuriy Lazenko", "yurii@gmail.com");

        FlightSchedule flightSchedule = new FlightSchedule();
        flightSchedule.addToSchedule(flight1);
        flightSchedule.addToSchedule(flight2);

        Services services = new Services(flightSchedule);
        services.buyTickets(0, passenger1);
        services.buyTickets(1, passenger2);

        System.out.println("Flight Schedule:");
        flightSchedule.displaySchedule();

        Calendar fromDate = new GregorianCalendar(2023, Calendar.OCTOBER, 1);
        Calendar toDate = new GregorianCalendar(2023, Calendar.OCTOBER, 31);
        double totalIncome = flightSchedule.calcTotalIncomeBetweenDates(fromDate, toDate);
        System.out.println("Розрахунок доходів між [" + fromDate.getTime() + "] - [" + toDate.getTime() + "] : $" + totalIncome);
    }
}
