public class Booking {


    private int bookingId;
    private int passengerId;
    private String flightNumber;
    private String seatNumber;
    private String classType;
    private String bookingDate;
    private String status;
    private String paymentMethod;
    private double price;
    private int baggage;

    public Booking(int bookingId, int passengerId, String flightNumber, String seatNumber, String classType) {
        this.bookingId = bookingId;
        this.passengerId = passengerId;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.classType = classType;
        this.status = "CONFIRMED";
    }

    public void bookFlight() {
        System.out.println("Flight booked successfully.");
        System.out.println("Booking Status: " + status);
    }

    public void cancelBooking() {
        status = "CANCELLED";
        System.out.println("Booking cancelled.");
    }

    public void printTicket() {
        System.out.println("\n--- TICKET ---");
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Passenger ID: " + passengerId);
        System.out.println("Flight: " + flightNumber);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Class: " + classType);
        System.out.println("Status: " + status);
    }
}