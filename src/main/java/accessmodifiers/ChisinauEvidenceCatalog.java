package accessmodifiers;

import peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person ion0001 = new Person("Ion", "Busuioc", 56894);
        Person pavel0001 = new Person("Pavel", "Pojoga", 57594);
        Person dan0001 = new Person("Pavel", "Pojoga", 57894, 18, false);
        Person vera001 = new Person("Vera", "Pojoga", 57114, 20, false);
        Person ana0001 = new Person("Ana", "Pojoga", 57224, 60, true);

        ion0001.isRetired = true;
        if (ion0001.isRetired) {
            System.out.println("Ion este la pensie");
        } else {
            System.out.println("Ion nu este la pensie");
        }

        if (dan0001.isRetired) {
            System.out.println("Dan este la pensie");
        } else {
            System.out.println("Dan nu este la pensie");
        }
        if (ana0001.isRetired) {
            System.out.println("Ana este la pensie");
        } else {
            System.out.println("Ana nu este la pensie");
        }

    }


}
