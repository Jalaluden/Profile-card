import java.util.ArrayList;
import java.util.List;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Jalal", 45000));
        employees.add(new Employee(2, "Kiran", 55000));
        employees.add(new Employee(3, "Arun", 50000));
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}