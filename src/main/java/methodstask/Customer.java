package methodstask;

public class Customer {
    //Definește 3 proprietăți private ale clasei Customer

    private String name;
    private String email;
    private int age;

    //Definește un constructor care o să primească parametrii necesari pentru a popula toate proprietățile noilor
    //obiecte (create cu ajutorul la constructor).

    public Customer(String name, String email, int age) {
        this.name = name;
        this.email = email;
        if (age >= 18 && age <= 100) {
            this.age = age;
        }
    }

    public Customer() {
    }

    //Definește metode de instanță, de tipul Getteri și Setteri care vor permite manipularea proprietăților din afară
//clasei Customer
    public void setName(String enteredName) {
        name = enteredName;
    }

    public String getName() {
        return this.name;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setAge(int age) {
        if (age > 100 || age < 18) {
            this.age = 0;
            System.out.println("Age not valid");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public String getTheObjectInformation() {
        return "The name, email and age of the custormer are " + this.name + " " + this.email + " " + age;
    }
}

