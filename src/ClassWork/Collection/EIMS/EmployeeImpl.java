package ClassWork.Collection.EIMS;
import java.util.List;

public interface EmployeeImpl {
    void listEmployee(List<Employee> employeeList);
    void addEmployee(List<Employee> employeeList, Employee emp);
    void deleteEmployee(List<Employee> employeeList, Employee emp);
    void updateEmployee(List<Employee> employeeList, Employee original, Employee update);
    Employee returnEmployee(List<Employee> employList,int employeeID);
}
