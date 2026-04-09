import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Passenger
        System.out.println("Enter Passenger Details:");
        int pId = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String passport = sc.nextLine();

        Passenger p = new Passenger(pId, name, age, passport);
        p.registerPassenger();
        p.validatePassport();

        // Flight
        System.out.println("Enter Flight Details:");
        String flightNo = sc.nextLine();
        String depCity = sc.nextLine();
        String arrCity = sc.nextLine();
        double price = sc.nextDouble();

        Flight f = new Flight(flightNo, depCity, arrCity, price);
        f.checkSeats();

        // Booking
        System.out.println("Enter Booking Details:");
        int bId = sc.nextInt();
        sc.nextLine();
        String seat = sc.nextLine();
        String classType = sc.nextLine();

        Booking b = new Booking(bId, pId, flightNo, seat, classType);
        b.bookFlight();


        System.out.println("\n------- FINAL DETAILS --------");
        p.displayPassenger();
        f.displayFlight();
        b.printTicket();

        sc.close();
    }
}