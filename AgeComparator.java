package homeworkContainers;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {

//    Override Method compare with params: p1 p2; Compare the p1 age with p2 age...

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getAge() - (p2.getAge());
    }
}
