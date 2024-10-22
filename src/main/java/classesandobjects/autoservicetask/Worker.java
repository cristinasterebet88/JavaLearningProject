package classesandobjects.autoservicetask;

public class Worker {
    String name;
    int age;
    double height;
    double salary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Worker() {
        name = "Gabriel";
        salary = 18000;
        System.out.println("A worker object has been created with a default name Gabriel and salary 18000 MDL");
    }
}
