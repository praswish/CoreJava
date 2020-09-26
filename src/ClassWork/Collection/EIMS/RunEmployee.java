package ClassWork.Collection.EIMS;

import java.util.ArrayList;

public class RunEmployee {

    public static ArrayList<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        EmployeeService es = new EmployeeService();
        es.listEmployee(employeeList);

        System.out.println("Added");
        Employee e1 = new Employee(1,"The","Rock");
        Employee e2 = new Employee(2,"John","Sena");

        es.addEmployee(employeeList,e1);
        es.addEmployee(employeeList,e2);
        es.listEmployee(employeeList);

        System.out.println("Updated");
        Employee updateEmployee = new Employee(2,"John","Cena");
        es.updateEmployee(employeeList,e2,updateEmployee);
        es.listEmployee(employeeList);

        System.out.println("Deleted");
        es.deleteEmployee(employeeList,updateEmployee);
        es.listEmployee(employeeList);

    }
}
