package system.school.objects;

import java.util.List;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeMap.size;

//  Development in progress...
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

                System.out.print("Enter School Name: ");
                String school_name = scanner.next();

                System.out.print("Enter Principal's  Full Name (Use underscore to represent space e.g Bill_Gate): ");
                String principal_name = scanner.next();

                System.out.print("Enter Principal's  Salary: ");
                int salary = scanner.nextInt();

                System.out.print("Enter Principal's  Year of Birth: ");
                int year = scanner.nextInt();

                System.out.print("Enter Principal's  Gender: ");
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
                System.out.println(newSchool.getName() + " School has been successfully created");
            } else if (userInput.equals("view_school")) {
                viewSchool();
            }
        }
        while (!userInput.equals("exit"));
        System.out.println(userInput);

    }


    //  Development in progress.....
    public static void viewSchool() {
        System.out.println("Select and type an action from the menu: (about_school  courses  register  login  exit)\n");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.next();
        if (userInput.equals("about_school")) {

            System.out.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt \n" +
                    "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris \n" +
                    "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse \n" +
                    "cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa \n" +
                    "qui officia deserunt mollit anim id est laborum.\n");

        } else if (userInput.equals("courses")) {
            List<Course> courses = School.getCourses();
            int length = size(courses);
            System.out.println(length);
            System.out.println("Course Name:        |          Course Teacher       |        Course Duration");
            for (int i = 0; i < length; i++) {
                System.out.println(i+1 + courses.get(i).getName() + "        |        " + courses.get(i).getTeacher() + "         |         " + courses.get(i).getDuration());
            }
        } else if (userInput.equals("register")) {
            System.out.print("Enter Full Name (Use underscore to represent space e.g Bill_Gate): ");
            String name = scan.next();

            System.out.print("Enter Gender (Male or Female): ");
            String gender = scan.next();

            System.out.print("Enter Score: ");
            int score = scan.nextInt();

            System.out.print("Enter Year of Birth: ");
            int year = scan.nextInt();

            Applicant applicant = new Applicant(name, gender, score, year);
            School.addApplicant(applicant);

        }
    }
}

