package zooclubservice;

public class Dog extends Animal implements AnimalInterface {
    //Definim un constructor pt a crea obiecte de tip Dog
    public Dog(String name) {
        //Apelam constructorul clasei parinte care are nevoie de aceasta proprietate
        super(name);
    }

    //Implementam metoda makesSound() declarata in AnimalInterface
    @Override
    public void makesSound() {
        System.out.println("Dog " + getName() + "saus: Woof!");
    }

    //Implementam metoda eat() declarata in clasa abstracta Animal
    @Override
    public void eat() {
        System.out.println(getName() + " is eating bones.");
    }
}
