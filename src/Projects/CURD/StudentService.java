package Projects.CURD;
import java.util.List;

public class StudentService implements StudentImpl {

    @Override
    public void listStudent(List<Student> studentList) {
        //System.out.printf("ID:    NAME        ADDRESS         EMAIL     DATE-OF-BIRTH\n");
        System.out.printf("%-6s %-15s %-20s %-20s %-15s\n","ID","NAME","ADDRESS", "EMAIL","DATE-OF-BIRTH");
        for (Student std : studentList){
            System.out.printf("%-6s %-15s %-20s %-20s %-15s\n", std.getId(), std.getName(),std.getAddress(),std.getEmail(),std.getDob());
        }
    }

    @Override
    public void addStudent(List<Student> studentList, Student std) {
        studentList.add(std);
    }

    @Override
    public void deleteStudent(List<Student> studentList, Student std) {
        studentList.remove(std);
    }

    @Override
    public void updateStudent(List<Student> studentList, Student std_old, Student std_new) {
        studentList.remove(std_old);
        studentList.add(std_new);
    }

    @Override
    public Student returnStudent(List<Student> studentList, int studentID) {
        for (Student std : studentList){
            if (std.getId() == studentID)
                return std;
        }
        return null;
    }
}
