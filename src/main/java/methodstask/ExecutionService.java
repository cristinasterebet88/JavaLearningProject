package methodstask;

public class ExecutionService {
    public static void main(String[] args) {
        //Atribuie valori pentru proprietățile obiectelor folosind atât constructorul cât și metode de instanță setteri
        Customer customer001 = new Customer();
//        customer001.name = "Gabriel";
        customer001.setName("Gabriel");
//        customer001.setEmail("Gabriel@gmail.com");
//        customer001.setAge(99);

        //Folosește metodele statice pentru a genera valori random pentru unele proprietăți
        customer001.setEmail(DataGeneratorUtil.getRandomEmail("gabriel", "@yahoo.com"));
        customer001.setAge(DataGeneratorUtil.getRandomInt(18, 100));

//        System.out.println(customer001.getName());
//        System.out.println(customer001.getEmail());
//        System.out.println(customer001.getAge());
        System.out.println(customer001.getTheObjectInformation());

        Customer customer002 = new Customer("Vasile", DataGeneratorUtil.getRandomEmail("vasile", "@gmail.com"), DataGeneratorUtil.getRandomInt(18, 100));
        System.out.println(customer002.getTheObjectInformation());
        System.out.println(DataGeneratorUtil.getRandomInt(20));

        System.out.println(DataGeneratorUtil.getRandomEmail("@gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("andrei", "@gmail.com"));
    }
}
