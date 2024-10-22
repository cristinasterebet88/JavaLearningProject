package classesandobjects.autoservicetask;

public class Car {
    String plateNumber;
    int kmWhenEnteredTheService;
    String color;
    String make;
    String model;

    // Constructorul de mai jos primește 3 parametri de intrare, în rezultatul că crea un obiect Car despre care se va cunoaște
    // marca, modelul, culoarea dar nu și alte detalii precum plateNumber sau km

    public Car(String makeOfTheCar, String modelOfTheCar, String colorOfTheCar) {
        make = makeOfTheCar;
        model = modelOfTheCar;
        color = colorOfTheCar;
    }

    public Car(String make, String model, String color, String PlateNumber, int km) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.plateNumber = plateNumber;
        kmWhenEnteredTheService = km;
        System.out.println("The car object has been created with all the details");
    }
}