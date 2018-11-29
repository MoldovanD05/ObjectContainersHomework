package homeworkContainers;

import java.util.*;

public class Main {

    public static void main(String... args) {

//        Instances of Employee, Student, Unemployed

        Person noah = new Employee(    "Noah",    27);
        Person kevin = new Student(    "Kevin",   21);
        Person james = new Unemployed( "James",   23);
        Person john = new Student(     "John",    19);
        Person matthew = new Employee( "Matthew", 34);
        Person bobby = new Unemployed(  "Bobby",    32);

//        Instances of Address

        Address address1 = new Address("England", "London",      "Apothecary Street",             "155B");
        Address address2 = new Address("America", "New York",    "Allen Street",                  "1341A");
        Address address3 = new Address("Romania", "Cluj-Napoca", "Strada Crinului",               "17");
        Address address4 = new Address("Spain",   "Madrid",      "Calle Fuencarral Street",       "133");
        Address address5 = new Address("Russia",  "Moscow",      "Kropotkinskiy pereulok Street", "15 - 17");

//        Instance of a people list & add the above objects (noah, kevin, james, john matthew, boby)

        List<Person> people = new ArrayList<>();
        people.add(noah);
        people.add(kevin);
        people.add(james);
        people.add(john);
        people.add(matthew);
        people.add(bobby);

//        Print the people list

//        System.out.println(people);

//        Iterates the people list using iterator

        Iterator it = people.iterator();
        System.out.println("My list is filled with: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        Empty string

        System.out.println(" ");

//        TreeSet Instance of personsByName and add the people List / Iterates the personsByName and print each element

        Set<Person> personsByName = new TreeSet<>(new NameComparator());
        personsByName.addAll(people);

        Iterator it1 = personsByName.iterator();
        System.out.println("The persons sorted by name are: ");
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

//        Empty String

        System.out.println(" ");

//        TreeSet Instance of personsByAge and add the people List / Iterates the personsByAge and print each element

        Set<Person> personsByAge = new TreeSet<>(new AgeComparator());
        personsByAge.addAll(people);

        Iterator it2 = personsByAge.iterator();
        System.out.println("The persons sorted by age are: ");
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

//        ArrayList Instance of hobbyList , instances of Hobby , and adds hobbies in hobbyList

        List<Hobby> hobbyList = new ArrayList<>();
        Hobby hobby1 = new Hobby("Drinking",        8,  address5);
        Hobby hobby2 = new Hobby("Skating",         4,  address2, address3, address4);
        Hobby hobby3 = new Hobby("Drinking Tea",    7,  address1);
        Hobby hobby4 = new Hobby("Arts and Crafts", 2,  address2, address4);
        Hobby hobby5 = new Hobby("Cooking",         27, address1, address2, address3, address4, address5);
        hobbyList.add(hobby1);
        hobbyList.add(hobby2);
        hobbyList.add(hobby3);
        hobbyList.add(hobby4);
        hobbyList.add(hobby5);

//        HashMap Instance of personsHobby & method .get() the element with E.g 0 1 2... from the people ArrayList

        Map<Person, List<Hobby>> personsHobby = new HashMap<>();

//        Max index is 5. Use only 0 1 2 3 4 5 to test. Otherwise you will get errors. :)

        Person pers = people.get(5);
        personsHobby.put(pers, hobbyList);

//        Empty String & Print of person name

        System.out.println(" ");
        System.out.println("The hobbies of " + pers.getName() + " are: ");

//        Foreach on personsHobby and print the value

        for (Object value : personsHobby.values()) {
            System.out.println(value);
        }
    }
}