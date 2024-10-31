package zooclubservice;

//Clasa Animal este dedicata procesului de mostenire
public abstract class Animal {
    private String name;

    //Constructor cu un parametru care permite setarea unui nume pentru animalele create in program
    public Animal(String name) {
        this.name = name;
    }

    //metoda publica concreta getName (poate fi si Protected)
    public String getName() {
        return name;
    }

    //Metoda anstracta eat() nu are implementare, va fi facut in clasa copil
    public abstract void eat();
}
