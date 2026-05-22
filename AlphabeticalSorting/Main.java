package AlphabeticalSorting;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Name {
    List<String> names = new ArrayList<>();
    Name (List<String> names) {
        this.names = names;
    }

    void sortNames() {
        Collections.sort(names);
    }

    void display() {
        System.out.println("Names:");
        names.forEach(System.out::println);
    }

}
public class Main {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Andrew");
        name.add("John");
        name.add("Marcus");
        name.add("Patrick");
        name.add("Alenere");

        Name names = new Name(name);
        names.sortNames();
        names.display();
    }
}
