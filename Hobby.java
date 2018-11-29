package homeworkContainers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hobby {

//    Private state of the Hobby Class

    private String nameH;
    private int frequency;
    private List<Address> addressList;

//    Constructor with params: nameH, frequency, Address

    public Hobby(String nameH, int frequency, Address... address) {
        this.nameH       = nameH;
        this.frequency   = frequency;
        this.addressList = new ArrayList<>();
        Collections.addAll(this.addressList, address);
    }

//    toString() Method for the state (nameH, frequency, addressList)

    public String toString() {
       return "\nHobby    : "   + nameH + "; " +
               "\nFrequency per week: "   + frequency    + "; " +
               "\nAddress   : "   + addressList  + ";";
    }
}