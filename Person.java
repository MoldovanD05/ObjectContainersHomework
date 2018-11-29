package homeworkContainers;

import java.util.*;

public class Person {

//    Private state of the Person Class name, age

    private String name;
    private int age;
    private List<String> hobbies = new ArrayList<>();

//    Constructor Person with params: name, age

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    toString() Method for the state (name, age)

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    public Method getName() state: name

    public String getName() {
        return name;
    }

//    public Method getAge() state: get

    public int getAge() {
        return age;
    }

//    public Method equals() with param: o and validations if (...) / if (...) returns age & name from Person

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

//    public Method hashCode() returns hash name, age

    public int hashCode() {
        return Objects.hash(name, age);
    }
}
