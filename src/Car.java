public class Car {

    // Fields
    private String registrationNumber;
    private String model;
    private String brand;
    private CarOwner owner; // The car's owner

    // Constructor
    public Car(String registrationNumber, String model, String brand, CarOwner owner) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.brand = brand;
        this.owner = owner;
    }

    // Getter for owner
    public CarOwner getOwner() {
        return owner;
    }

    // Setter for owner (used when buying/selling)
    public void setOwner(CarOwner owner) {
        this.owner = owner;
    }

    // Method to buy the car
    public void buy(CarOwner newOwner) {
        this.owner = newOwner;
        System.out.println("Car " + registrationNumber + " is now owned by " + newOwner.getName());
    }

    // Method to sell the car
    public void sell(CarOwner newOwner) {
        this.owner = newOwner;
        System.out.println("Car " + registrationNumber + " has been sold to " + newOwner.getName());
    }

    // Optional: getters for registration, model, brand
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
}
