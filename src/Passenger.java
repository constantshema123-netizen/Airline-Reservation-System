public class Passenger {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String passportNumber;
    private String phone;
    private String email;
    private String nationality;
    private String address;
    private String frequentFlyerNumber;

    public Passenger(int id, String name, int age, String passportNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.passportNumber = passportNumber;
    }

    public void registerPassenger() {
        System.out.println("Passenger registered successfully.");
    }

    public void validatePassport() {
        if (passportNumber != null && passportNumber.length() >= 6) {
            System.out.println("Passport is valid.");
        } else {
            System.out.println("Invalid passport.");
        }
    }

    public void displayPassenger() {
        System.out.println("Passenger ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Passport: " + passportNumber);
    }
}
