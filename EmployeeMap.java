import java.util.*;

public class EmployeeMap {
    public static void main(String[] args) {
        HashMap<Integer, String> employeeDepartments = new HashMap<>();
        employeeDepartments.put(1001, "HR");
        employeeDepartments.put(1002, "IT");
        employeeDepartments.put(1003, "Finance");

        for (Map.Entry<Integer, String> entry : employeeDepartments.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() + ", Department: " + entry.getValue());
        }
    }
}
