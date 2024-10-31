package zooclubservice;

public class Cat extends Animal implements AnimalInterface {
    //Definim un constructor pt a crea obiecte de tip Dog
    public Cat(String name) {
        //Apelam constructorul clasei parinte care are nevoie de aceasta proprietate
        super(name);
    }

    //Implementam metoda makesSound() declarata in AnimalInterface
    @Override
    public void makesSound() {
        System.out.println("Cat " + getName() + " says: Meow!");
    }

    //Implementam metoda eat() declarata in clasa abstracta Animal
    @Override
    public void eat() {
        System.out.println(getName() + " is eating fish.");
    }
}
