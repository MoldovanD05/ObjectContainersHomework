package homeworkContainers;


public class Address {

//    Private state of the Address Class

    private String country;
    private String city;
    private String street;
    private String number;

//    Constructor with params: country, city, street, number

    public Address(String country, String city, String street, String number) {
        this.country = country;
        this.city    = city;
        this.street  = street;
        this.number  = number;
    }

//    toString() Method for the state (country, city, street, number)

    public String toString() {
        return "\n - Country: " + country + "; " +
                "City: " + city + "; " +
                "Street: " + street + "; " +
                "Number: " + number + "; " +
                " ";
    }
}
