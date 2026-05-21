package EmployeeNamePrinter;

import java.util.List;
@FunctionalInterface
interface Employee {
    public List<String> getNames();
}
public class Main {
    public static void main(String[] args) {
        Employee employee = () -> List.of(
            "Andrew",
            "John",
            "Patrick",
            "Alenere"
        );

        employee.getNames().stream().map(i -> i.toUpperCase()).forEach(System.out::println);
    }
}