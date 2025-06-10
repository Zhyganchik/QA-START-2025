import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

class Plane {
    private UUID flightId;
    private int maxPassengers;
    private int passengers;

    public Plane(int maxPassengers, int passengers) {
        this.flightId = UUID.randomUUID();
        this.maxPassengers = maxPassengers;
        this.passengers = passengers;
    }

    public int getAvailableSeats() {
        return maxPassengers - passengers;
    }

    public boolean isHalfOrLessFull() {
        return passengers <= maxPassengers / 2;
    }

    @Override
    public String toString() {
        return "Flight " + flightId + " | Passengers: " + passengers + "/" + maxPassengers;
    }
}

public class MyHome7 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Plane> planes = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int maxPassengers = 100 + random.nextInt(101);
            int passengers = random.nextInt(maxPassengers + 1);
            Plane plane = new Plane(maxPassengers, passengers);
            planes.add(plane);
            System.out.println(plane + " | Available seats: " + plane.getAvailableSeats());
        }

        long halfOrLess = planes.stream().filter(Plane::isHalfOrLessFull).count();
        System.out.println("\nPlanes with half or fewer seats taken: " + halfOrLess);
    }
}
