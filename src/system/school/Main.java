package system.school;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //  print the School menu for the user.
        Scanner scanner = new Scanner(System.in);
        String userInput;
        do {
            System.out.println("\nWelcome! Select and type an action from the menu: (about_app  create_school  view_school  select_school  exit)");
            userInput = scanner.next();
            if (userInput.equals("about_app")) {

                System.out.println("This a simple school management system. It will allow you to create a school and manage the school.\n" +
                        "You can create a school by typing create_school in the menu.\n" +
                        "If you have created a school already, you can view all schools registered on the system by typing view_schools.\n" +
                        "You can check your school of interest from the list of schools by typing select_school, then entering the name of the school...\n");

            } else if (userInput.equals("create_school")) {
                System.out.println("Enter school name: ");
                String school_name = scanner.next();

                System.out.print("Enter Principal's  Full Name: ");
                String principal_name = scanner.nextLine();

                System.out.println("Enter Principal's  Salary: ");
                int salary = scanner.nextInt();

                System.out.print("Enter Principal's  Year of Birth: ");
                int year = scanner.nextInt();

                System.out.println("Enter Principal's  Gender: ");
                String gender = scanner.next();

                System.out.print("Enter Principal's  Password: ");
                String password = scanner.next();

                Principal principal = new Principal("Principal", principal_name, gender, salary, year, password) {

                    @Override
                    public void view() {
                        System.out.println("Here are the staffs of " + School.getName());
                        System.out.println("Principal: " + School.getPrincipal().toString());
                        System.out.println("Teachers: " + School.getTeachers().toString());
                        System.out.println("Non Academic Staffs: " + School.getNon_academics().toString());
                        System.out.println("Students: " + School.getStudents().toString());
                        System.out.println("Applicants: " + School.getApplicants().toString());
                        System.out.println("Courses: " + School.getCourses().toString());
                        System.out.println("Classes: " + School.getClasses().toString());
                        return;
                    }

                };
                School newSchool = new School(school_name, principal);
                System.out.println(School.getName() + " School has been successfully created");
            }
        }
        while (!userInput.equals("exit"));
        System.out.println(userInput);

    }
}
