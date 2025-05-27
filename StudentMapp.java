import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }
}

public class StudentMapp {
    public static void main(String[] args) {
        TreeMap<Integer, Student> students = new TreeMap<>();
        students.put(102, new Student("Alice", 20));
        students.put(101, new Student("Bob", 21));
        students.put(103, new Student("Charlie", 19));

        for (Map.Entry<Integer, Student> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Info: " + entry.getValue());
        }
    }
}
