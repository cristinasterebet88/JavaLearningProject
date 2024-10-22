package classesandobjects.autoservicetask;

public class ManageAutoService {

    public static void main(String[] args) {

        Car car0001 = new Car("Audi", "Q5", "Black");
        Car car0002 = new Car("Peugeut", "508", "Gray");

        System.out.println(car0002.make + " " + car0002.model + " " + car0002.color + " " + car0002.plateNumber);

        Car car0003 = new Car("BMW", "X5", "Red", "BOS 01", 6500);
        Car car0004 = new Car("BMW", "X5", "Red", "BOS 02", 6400);

        Tool tool0001 = new Tool("Hammer", 2);

        System.out.println("The name of the tool is " + tool0001.name + " " + tool0001.weight);

        Worker ionMuncitor = new Worker();
        Worker pavelMuncitor = new Worker("Pavel", 5000);

        Garage garageBavaria = new Garage();

    }
}
