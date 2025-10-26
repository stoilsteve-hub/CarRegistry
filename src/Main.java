public class Main {
    public static void main(String[] args) {

        // Step 1: Create CarOwners with updated ages and addresses
        CarOwner stoil = new CarOwner("Stoil Zhelyazkov", "Rissne 1, Stockholm", 38);
        CarOwner sergej = new CarOwner("Sergej Ryderholm", "Liljeholmen 2, Stockholm", 47);

        // Step 2: Create cars
        Car volvo = new Car("XYZ48N", "XC60", "Volvo", stoil);         // Volvo owned by Stoil
        Car tesla = new Car("RBC48N", "Model 3", "Tesla", sergej);     // Tesla owned by Sergej

        // Step 3: Print initial ownership
        System.out.println("Initial ownership:");
        System.out.println(volvo.getRegistrationNumber() + " is owned by " + volvo.getOwner().getName());
        System.out.println(tesla.getRegistrationNumber() + " is owned by " + tesla.getOwner().getName());

        // Step 4: Transactions
        volvo.sell(sergej);    // Stoil sells Volvo to Sergej
        tesla.sell(stoil);     // Sergej sells Tesla to Stoil

        // Step 5: Print new ownership after sales
        System.out.println("\nAfter sales:");
        System.out.println(volvo.getRegistrationNumber() + " is now owned by " + volvo.getOwner().getName());
        System.out.println(tesla.getRegistrationNumber() + " is now owned by " + tesla.getOwner().getName());
    }
}
