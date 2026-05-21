package StudentFilter;

import java.util.function.Predicate;
import java.util.List;
@FunctionalInterface
interface Student {
    List<Integer> getAgeValid();
}
public class Main {
    public static void main(String[] args) {
        Student student = () -> List.of(
            14,23,34,11,17,15,15,12,18,19
        );
        Predicate<Integer> ageValid = age -> age >= 18;

        student.getAgeValid().stream().filter(ageValid).forEach(System.out::println);
    }
}
