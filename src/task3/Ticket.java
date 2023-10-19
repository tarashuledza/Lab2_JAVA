package task3;

import java.util.Random;

public class Ticket {
    private final Passenger passenger;
    public Ticket(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "passenger=" + passenger +
                '}';
    }
}
