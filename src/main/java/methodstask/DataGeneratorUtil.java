package methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    static Random random = new Random();
    //nu putem folosi proprietati de instanta in metode statice!!!

    //Definește două metode statice și publice care vor returna un o valoare int și vor purta numele de
//getRandomInt (). Folosește parametri diferiți astfel încât fiecare să ai principiul de overloading
    public static int getRandomInt(int min, int max) {

        if (min >= max) {
            System.out.println("Val min trebuie sa fie mai mica ca cea maxima");
            return 0;
        }
        int delta = max - min;
        int deltaRandomInt = random.nextInt(delta);
        int randomNumber = deltaRandomInt + min;
        return randomNumber;
    }

    public static int getRandomInt(int limit) {
        return random.nextInt(limit);
    }

    //Definește o metodă statică, care va returna o valoare String ce reprezintă un email unic.
    //Definește o metodă care va genera un String random de o anumită lungime.

    public static String getRandomEmail(String emailDomain) {
        return UUID.randomUUID().toString() + emailDomain;
    }

    public static String getRandomEmail(String prefix, String emailDomain) {
        return prefix + getRandomInt(999999) + emailDomain;
        //Am folost metoda statica definita mai sus, in aceeasi clasa. Apelul ei poate fi facut fara numele clasei in fata (DataGeneratorUtil)
    }
}
