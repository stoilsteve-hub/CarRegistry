import java.util.Scanner;

public class MainDynamicInput {

    public MainDynamicInput() {

        Scanner scanner = new Scanner(System.in);

        // --- Create CarOwners dynamically ---
        System.out.println("How many car owners do you want to create?");
        int ownerCount = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        CarOwner[] owners = new CarOwner[ownerCount];

        for (int i = 0; i < ownerCount; i++) {
            System.out.println("Enter name for owner #" + (i + 1) + ":");
            String name = scanner.nextLine();

            System.out.println("Enter address for owner #" + (i + 1) + ":");
            String address = scanner.nextLine();

            System.out.println("Enter age for owner #" + (i + 1) + ":");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            owners[i] = new CarOwner(name, address, age);
        }

        // --- Create Cars dynamically ---
        System.out.println("How many cars do you want to create?");
        int carCount = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        Car[] cars = new Car[carCount];

        for (int i = 0; i < carCount; i++) {
            System.out.println("Enter registration number for car #" + (i + 1) + ":");
            String reg = scanner.nextLine();

            System.out.println("Enter brand for car #" + (i + 1) + ":");
            String brand = scanner.nextLine();

            System.out.println("Enter model for car #" + (i + 1) + ":");
            String model = scanner.nextLine();

            System.out.println("Enter owner number (1 to " + ownerCount + ") for this car, or 0 if no owner:");
            int ownerNum = scanner.nextInt();
            scanner.nextLine(); // consume leftover newline

            CarOwner carOwner = (ownerNum == 0) ? null : owners[ownerNum - 1];
            cars[i] = new Car(reg, model, brand, carOwner);
        }

        // --- Print initial ownership ---
        System.out.println("\nInitial ownership:");
        for (Car car : cars) {
            if (car.getOwner() != null) {

                System.out.println(car.getRegistrationNumber() + " is owned by " + car.getOwner().getName());
            } else {
                System.out.println(car.getRegistrationNumber() + " is currently not owned by anyone");
            }
        }

        // --- Simple transactions example ---
        System.out.println("\nLet's perform some transactions.");
        if (ownerCount >= 2 && carCount >= 2) {
            cars[0].sell(owners[1]);
            cars[1].sell(owners[0]);
        }

        // --- Print final ownership ---
        System.out.println("\nFinal ownership:");
        for (Car car : cars) {
            if (car.getOwner() != null) {
                System.out.println(car.getRegistrationNumber() + " is owned by " + car.getOwner().getName());
            } else {
                System.out.println(car.getRegistrationNumber() + " is currently not owned by anyone");
            }
        }

        scanner.close();
    }

    // Main method
    public static void main(String[] args) {
        new MainDynamicInput(); // Run the program
    }
}
