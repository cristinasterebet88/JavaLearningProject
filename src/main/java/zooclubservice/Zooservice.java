package zooclubservice;

public class Zooservice {
    public static void main(String[] args) {
        //Aplicam polimorfismul pentru a declara un obiect de tip Animal, fiind creat cu constructorul clasei copil Dog
        Animal dog = new Dog("Laika");
        Cat cat = new Cat("Sonic");
        Dog secondDog = new Dog("Virus");

        dog.eat();

        cat.eat();
        cat.makesSound();
    }
}
