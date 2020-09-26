package ClassWork.Collection.EIMS;

import java.util.ArrayList;
import java.util.Scanner;

public class RunEmployeeMenu {

    public static ArrayList<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        EmployeeService es = new EmployeeService();
        Scanner input= new Scanner(System.in);
        int id;

        Employee e1 = new Employee(1, "Praswish", "New York");
        Employee e2 = new Employee(2, "Gita", "Texas");
        Employee e3 = new Employee(3, "Sandesh", "Texas");
        es.addEmployee(employeeList,e1);
        es.addEmployee(employeeList,e2);
        es.addEmployee(employeeList,e3);


        //Employee temp=es.returnEmployee(employeeList,8);
        //System.out.println(temp.getName());


        int choice;
        while( (choice = menuChoose()) != 5){
            switch(choice){
                case 1:
                    System.out.println("1. Display List");
                    es.listEmployee(employeeList);

                    getch();
                    break;
                case 2:
                    System.out.println("2. Add Employee");

                    id =-1;
                    String name;
                    String address;
                    System.out.print("Enter the ID: ");
                    Employee emp1;
                    do {
                        if (id != -1)
                            System.out.println("Invalid ID");
                        id = input.nextInt();
                        emp1 = es.returnEmployee(employeeList,id);
                    }while (emp1 != null);

                    System.out.print("Enter the Name: ");
                    name = input.nextLine();
                    name = input.nextLine();
                    System.out.print("Enter the Address: ");
                    address = input.nextLine();

                    Employee newEmployee = new Employee(id, name, address);
                    es.addEmployee(employeeList,newEmployee);
                    System.out.println("New Employee Added");
                    getch();
                    break;
                case 3:
                    System.out.println("3. Edit Employee");
                    es.listEmployee(employeeList);
                    System.out.println("Enter the ID to Edit:");


                    id = input.nextInt();
                    Employee updateEmployee = es.returnEmployee(employeeList,id);
                    if (updateEmployee == null){
                        System.out.println("Employee Not Found");
                    }
                    else
                    {
                        System.out.print("Enter the Name: ");
                        name = input.nextLine();
                        name = input.nextLine();
                        System.out.print("Enter the Address: ");
                        address = input.nextLine();
                        Employee newEmployee1 = new Employee(id, name, address);

                        es.updateEmployee(employeeList, updateEmployee,newEmployee1);
                        System.out.println("Employee Updated");
                    }
                    getch();
                    break;
                case 4:
                    System.out.println("4. Delete Employee");
                    es.listEmployee(employeeList);
                    System.out.println("Enter the ID to Delete:");

                    id = input.nextInt();
                    Employee deleteEmployee = es.returnEmployee(employeeList,id);
                    if (deleteEmployee == null){
                        System.out.println("Employee Not Found");
                    }
                    else
                    {
                        es.deleteEmployee(employeeList, deleteEmployee);
                        System.out.println();
                        System.out.println("Employee Deleted");
                    }
                    getch();
                    break;

            }
        }
        if (choice==5) {
            System.out.println("Thank you for using the program");
        }
        /*
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
        */

    }


    public static int menuChoose(){

        int choice =1;
        Scanner input=new Scanner(System.in);

        System.out.println("Employee Information Management System");
        System.out.println("1 :: Display List ");
        System.out.println("2 :: Add Employee ");
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

    public static void getch(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please Press Enter to continue:");
        input.nextLine();
    }

}

