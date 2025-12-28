package LAB5.lab5_15;

public class Car extends RentalVehicle {

    
    public Car(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate + 100.0; 
    }
}

