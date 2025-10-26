import java.util.Scanner;

public class MainUser {

    public MainUser() {

        Scanner scanner = new Scanner(System.in);

        // --- Create CarOwners with user input ---
        System.out.println("Enter first car owner's name:");
        String name1 = scanner.nextLine();

        System.out.println("Enter first car owner's address:");
        String address1 = scanner.nextLine();

        System.out.println("Enter first car owner's age:");
        int age1 = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        CarOwner owner1 = new CarOwner(name1, address1, age1);

        System.out.println("Enter second car owner's name:");
        String name2 = scanner.nextLine();

        System.out.println("Enter second car owner's address:");
        String address2 = scanner.nextLine();

        System.out.println("Enter second car owner's age:");
        int age2 = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        CarOwner owner2 = new CarOwner(name2, address2, age2);

        // --- Create Cars with user input ---
        System.out.println("Enter first car registration number:");
        String reg1 = scanner.nextLine();

        System.out.println("Enter first car brand:");
        String brand1 = scanner.nextLine();

        System.out.println("Enter first car model:");
        String model1 = scanner.nextLine();

        Car car1 = new Car(reg1, model1, brand1, owner1);

        System.out.println("Enter second car registration number:");
        String reg2 = scanner.nextLine();

        System.out.println("Enter second car brand:");
        String brand2 = scanner.nextLine();

        System.out.println("Enter second car model:");
        String model2 = scanner.nextLine();

        Car car2 = new Car(reg2, model2, brand2, owner2);

        // --- Print initial ownership ---
        System.out.println("\nInitial ownership:");
        System.out.println(car1.getRegistrationNumber() + " is owned by " + car1.getOwner().getName());
        System.out.println(car2.getRegistrationNumber() + " is owned by " + car2.getOwner().getName());

        // --- Transactions ---
        System.out.println("\nTransaction: " + owner1.getName() + " sells " + car1.getRegistrationNumber() + " to " + owner2.getName());
        car1.sell(owner2);

        System.out.println("Transaction: " + owner2.getName() + " sells " + car2.getRegistrationNumber() + " to " + owner1.getName());
        car2.sell(owner1);

        // --- Print final ownership ---
        System.out.println("\nFinal ownership:");
        System.out.println(car1.getRegistrationNumber() + " is now owned by " + car1.getOwner().getName());
        System.out.println(car2.getRegistrationNumber() + " is now owned by " + car2.getOwner().getName());

        scanner.close();
    }

    // Main method
    public static void main(String[] args) {
        new MainUser(); // Run the simulation
    }
}
