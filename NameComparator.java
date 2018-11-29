package homeworkContainers;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

//    Override Method compare with params: p1 p2; Compare the p1 name with p2 name...

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
