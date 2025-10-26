public class MainProgram {

    // Constructor runs the simulation
    public MainProgram() {

        // Create CarOwners
        CarOwner stoil = new CarOwner("Stoil Zhelyazkov", "Rissne 1, Stockholm", 38);
        CarOwner sergej = new CarOwner("Sergej Ryderholm", "Liljeholmen 2, Stockholm", 47);

        // Create Cars
        Car volvo = new Car("ABC123", "XC60", "Volvo", stoil);
        Car tesla = new Car("RBC48N", "Model S", "Tesla", sergej);
        Car bmw = new Car("XYZ789", "X5", "BMW", null); // No owner initially

        // Print initial ownership
        System.out.println("Initial ownership:");
        System.out.println(volvo.getRegistrationNumber() + " is owned by " + volvo.getOwner().getName());
        System.out.println(tesla.getRegistrationNumber() + " is owned by " + tesla.getOwner().getName());
        System.out.println(bmw.getRegistrationNumber() + " is currently not owned by anyone");

        // Transactions
        volvo.sell(sergej); // Stoil sells Volvo to Sergej
        tesla.sell(stoil);  // Sergej sells Tesla to Stoil
        bmw.buy(stoil);     // Stoil buys the BMW

        // Print final ownership
        System.out.println("\nFinal ownership of cars:");
        System.out.println(volvo.getRegistrationNumber() + " is now owned by " + volvo.getOwner().getName());
        System.out.println(tesla.getRegistrationNumber() + " is now owned by " + tesla.getOwner().getName());
        System.out.println(bmw.getRegistrationNumber() + " is now owned by " + bmw.getOwner().getName());
    }

    // Main method just runs the program
    public static void main(String[] args) {
        new MainProgram(); // Run the simulation
    }
}
