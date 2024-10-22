package peopleevidence;

public class Person {

    public String firstname;
    String lastname;
    int id;
    private int age;
    public boolean isRetired;

    public Person(String firstname, String lastname, int id) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        System.out.println("Un obiect de tip person a fost creat folosind un constructor cu 3 parametri formali");

    }

    public Person(String firstname, String lastname, int id, int age, boolean isRetired) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
        this.age = age;
        this.isRetired = isRetired;
        System.out.println("Un obiect de tip person a fost creat folosind un constructor cu 5 parametri formali");

    }

    public void setAge(int enteredAge) {
        if (enteredAge > 0 && enteredAge < 100) {
            this.age = enteredAge;
        } else {
            System.out.println("The entered age is not valid, the property age is still empty.");
        }
    }
}

