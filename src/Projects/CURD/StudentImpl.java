package Projects.CURD;
import java.util.List;

public interface StudentImpl {
    void listStudent(List<Student> studentList);
    void addStudent(List<Student> studentList, Student std);
    void deleteStudent(List<Student> studentList, Student std);
    void updateStudent(List<Student> studentList, Student std_old, Student std_new);
    Student returnStudent(List<Student> studentList, int studentID);
}
