//write a program that declare an empty set write a code to add 4 names remove 2 name display the content before and after the content
import java.util.*;

public class demo {
    public static void main(String[] args) {
        // empty set of strings
        Set<String> names = new HashSet<>();

        // scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter names to add to the set (up to 4 names):");
        int count = 0;
        while (count < 4) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            names.add(input);
            count++;
        }

        // Display the content before removal
        System.out.println("Before removal: " + names);

        // Remove the before and after automatically
        String before = names.iterator().next(); // Get the first name
        names.remove(before);

        String after = null;
        for (String name : names) { // Loop through the remaining names to get the last name
            after = name;
        }
        names.remove(after);

        // Display the content after removal
        System.out.println("After removal: " + names);

        // Close the scanner
        scanner.close();
    }
}
