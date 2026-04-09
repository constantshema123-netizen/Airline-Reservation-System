public class Flight {


    private String flightNumber;
    private String airline;
    private String departureCity;
    private String arrivalCity;
    private String date;
    private String time;
    private double duration;
    private int capacity;
    private double price;
    private String status;


    public Flight(String flightNumber, String departureCity, String arrivalCity, double price) {
        this.flightNumber = flightNumber;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.price = price;
        this.capacity = 100; // default
    }

    public void checkSeats() {
        if (capacity > 0) {
            System.out.println("Seats are available.");
        } else {
            System.out.println("Flight is full.");
        }
    }

    public double calculateFare() {
        double tax = 0.1 * price;
        double total = price + tax;
        System.out.println("Total fare (with tax): " + total);
        return total;
    }

    public void displayFlight() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Route: " + departureCity + " → " + arrivalCity);
        System.out.println("Price: " + price);
    }
}