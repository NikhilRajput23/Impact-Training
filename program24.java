class Employee {
    public void work() {
        System.out.println("Employee is working");
    }

    public double getSalary() {
        return 30000.0; 
    }
}

class HRManager extends Employee {
    public void work() {
        System.out.println("HR Manager is managing HR tasks");
    }

    public void addEmployee() {
        System.out.println("HR Manager is adding a new employee");
    }
}

public class program24 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();
        System.out.println("Salary: " + emp.getSalary());

        HRManager hr = new HRManager();
        hr.work();               
        System.out.println("Salary: " + hr.getSalary()); 
        hr.addEmployee();       
    }
}
