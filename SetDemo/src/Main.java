//write a program that declare an empty set write a code to add 4 names remove 2 name display the content before and after the content

import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        // Create an empty set of strings
        Set<String> names = new HashSet<>();

        // Add four names to the set
        names.add("mukul");
        names.add("satish");
        names.add("rishikesh");
        names.add("satyam");
        String nameToSearch = "mukul";
        if (names.contains(nameToSearch)) {
            System.out.println(nameToSearch + " is in the Set.");
        } else {
            System.out.println(nameToSearch + " is not in the Set.");
        }
        // Display the content before removal
        System.out.println("Before removal: " + names);

        // Remove two names from the set
        names.remove("mukul");
        names.remove("satyam");

        // Display the content after removal
        System.out.println("After removal: " + names);



    }

}
