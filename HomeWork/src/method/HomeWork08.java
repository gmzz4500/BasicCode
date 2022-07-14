package method;

public class HomeWork08 {
    public static void main(String[] args) {
        Employee employee = new Employee("马云", "男", 60, "董事长", 1000000000);
    }
}
class Employee{
    String name;
    String gender;
    int age;
    String position;
    double salary;

    public Employee(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String position, double salary) {
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, String gender, int age, String position, double salary) {
        this(name,gender,age);
        this.position = position;
        this.salary = salary;
    }

    public Employee() {
    }
}