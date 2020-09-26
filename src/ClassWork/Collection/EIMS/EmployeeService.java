package ClassWork.Collection.EIMS;
import java.util.List;
public class EmployeeService implements EmployeeImpl{
    @Override
    public void listEmployee(List<Employee> employeeList) {
        System.out.printf("ID:    NAME        ADDRESS\n");
        for(Employee emp: employeeList){
            //System.out.println(emp.toString());
            System.out.printf("%-6s %-10s %-20s\n", emp.getId(), emp.getName(),emp.getAddress());
        }
    }

    @Override
    public void addEmployee(List<Employee> employeeList, Employee emp) {
        employeeList.add(emp);
    }

    @Override
    public void updateEmployee(List<Employee> employeeList, Employee original, Employee update) {
        employeeList.remove(original);
        employeeList.add(update);
    }

    @Override
    public void deleteEmployee(List<Employee> employeeList, Employee emp) {
        employeeList.remove(emp);
    }

    @Override
    public Employee returnEmployee(List<Employee> employeeList, int employeeID) {

        for(Employee emp: employeeList){
            if (emp.getId()== employeeID)
                return emp;
        }
        return null;
    }
}
