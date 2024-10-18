public class Main {
    public static void main(String[] args) {
        FullTime f1 = new FullTime("Vikas", "123b1f091", 400, 100);
        PartTime p1 = new PartTime("Vikas", "123b1f091", 400, 100);
        System.out.println(f1.name + " " + f1.empId + " " + f1.salary + " " + f1.Bonus);
        System.out.println(p1.name + " " + p1.empId + " " + p1.salary + " " + p1.hourlyRate);
    }
}
class Employee {
    String name;
    String empId;
    int salary;
    Employee(String name, String empId, int salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }
}
class FullTime extends Employee{
    int Bonus;
    FullTime(String name, String empId, int salary, int Bonus) {
        super(name, empId, salary);
        this.Bonus = Bonus;
    }
}
class PartTime extends Employee {
    int hourlyRate;
    PartTime(String name, String empId, int salary, int hourlyRate) {
        super(name, empId, salary);
        this.hourlyRate = hourlyRate;
    }
}