package Projects.CURD;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RunStudentMenuFile {
    public static ArrayList<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        StudentService ss = new StudentService();
        Scanner input = new Scanner(System.in);
        int id;
        String name,address,email,dob;
        ReadFromFile();

        int choice;
        while((choice = menuChoose()) !=5){
            switch (choice){
                case 1:
                    System.out.println("1. Display Student");
                    ss.listStudent(studentList);
                    getch();
                    break;

                case 2:
                    System.out.println("2. Add Student");

                    id =-1;

                    System.out.print("Enter the ID: ");
                    Student std1;
                    do {
                        if (id != -1)
                            System.out.println("Invalid ID");
                        id = input.nextInt();
                        std1 = ss.returnStudent(studentList,id);
                    }while (std1 != null);

                    System.out.print("Enter the Name: ");
                    name = input.nextLine();
                    name = input.nextLine();
                    System.out.print("Enter the Address: ");
                    address = input.nextLine();
                    System.out.print("Enter the email: ");
                    email = input.nextLine();
                    System.out.print("Enter the Date of Birth: ");
                    dob = input.nextLine();

                    Student newStudent = new Student(id, name, address,email,dob);
                    ss.addStudent(studentList ,newStudent);
                    System.out.println("New Student Added");

                    getch();
                    break;

                case 3:
                    System.out.println("3. Edit Student");
                    ss.listStudent(studentList);



                    System.out.println("Enter the ID to Edit:");


                    id = input.nextInt();
                    Student updateStudent = ss.returnStudent(studentList,id);
                    if (updateStudent == null){
                        System.out.println("Student Not Found");
                    }
                    else
                    {
                        System.out.print("Enter the Name: ");
                        name = input.nextLine();
                        name = input.nextLine();
                        System.out.print("Enter the Address: ");
                        address = input.nextLine();
                        System.out.print("Enter the email: ");
                        email = input.nextLine();
                        System.out.print("Enter the Date of Birth: ");
                        dob = input.nextLine();
                        if (name.equals(""))
                            name = updateStudent.getName();
                        if(address.equals(""))
                            address = updateStudent.getAddress();
                        if (email.equals(""))
                            email= updateStudent.getEmail();
                        if (dob.equals(""))
                            dob=updateStudent.getDob();

                        Student newStudent1 = new Student(id, name, address,email,dob);

                        ss.updateStudent(studentList, updateStudent,newStudent1);
                        System.out.println("Student Updated");
                    }

                    getch();
                    break;
                case 4:

                    System.out.println("4. Delete Student");
                    ss.listStudent(studentList);
                    System.out.println("Enter the ID to Delete:");

                    id = input.nextInt();
                    Student deleteStudent = ss.returnStudent(studentList,id);
                    if (deleteStudent== null){
                        System.out.println("Student Not Found");
                    }
                    else
                    {
                        ss.deleteStudent(studentList, deleteStudent);
                        System.out.println();
                        System.out.println("Student Deleted");
                    }
                    getch();
                    break;

            }
        }
        if (choice==5) {
            System.out.println("Thank you for using the program");
            SavetoFile();
        }
    }

    public static void SavetoFile() {
        try {
            FileOutputStream f = new FileOutputStream(new File("myStudents.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);

            // Write objects to file
            for (Student std: studentList) {
                o.writeObject(std);
            }
            o.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found w");
        } catch (IOException e) {
            System.out.println("Error initializing stream w");
        }

    }

    public static void ReadFromFile() {
        try {
            FileInputStream fi = new FileInputStream(new File("myStudents.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            // Read objects
            StudentService ss = new StudentService();
            Student std;
            while (fi.available() >0) {
                std = (Student) oi.readObject();
                ss.addStudent(studentList, std);
            }
            oi.close();
            fi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public static Student InputStudent(){
        Scanner input = new Scanner(System.in);
        int id;
        String name,address,email,dob;
        System.out.print("Enter the ID: ");
        id = input.nextInt();
        System.out.print("Enter the Name: ");
        name = input.nextLine();
        System.out.print("Enter the Address: ");
        address = input.nextLine();
        System.out.print("Enter the Email: ");
        email = input.nextLine();
        System.out.print("Enter the Date of Birth: ");
        dob = input.nextLine();

        Student student = new Student(id, name, address,email, dob);
        return student;
    }

    public static int menuChoose(){

        int choice =1;
        Scanner input=new Scanner(System.in);

        System.out.println("CURD - Application");
        System.out.println("1 :: Display Student ");
        System.out.println("2 :: Add Student ");
        System.out.println("3 :: Edit Student ");
        System.out.println("4 :: Delete Student ");
        System.out.println("5 :: Quit ");
        System.out.print("Please Choose option(1-5) ");
        do {
            if (choice <1 || choice >5)
                System.out.print("Please Choose (1-5)");
            choice = input.nextInt();

        }while (choice<1 || choice >5);
        return choice;
    }

    public static void getch() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Press Enter to continue:");
        input.nextLine();
    }
}
