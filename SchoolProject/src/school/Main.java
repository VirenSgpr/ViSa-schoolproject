package school;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, ClassFullException {
        //Initial Details of Project
        String name;
        do {
        System.out.println("**************************************");
        System.out.println("Welcome to the School Admissions App !!!   Press X for exit");
        System.out.println("**************************************");
        Scanner scanner = new Scanner(System.in);
        //Name entering loop
        do{
            System.out.println("Enter the name of the student:  (no less than 3 chars and no more than 50 chars)");
            name = scanner.nextLine();
            if(name.equals("x")|| name.equals("X"))
            {
                exit(0);
            }
            if (name.length() < 3 || name.length() > 50){
                System.out.println("Please enter valid name for school");
            }
        } while(name.length() < 3 || name.length() > 50);
        //Age entering loop
        int age;
        do {
            System.out.println("Enter the age of the student: ");
            age = scanner.nextInt();
            if(age < 4 || age > 17){
                System.out.println("No schools available, Please enter valid age for school");
            }
        } while(age < 4 || age > 17);

        System.out.println("********************");

        System.out.println("Student Name: " + name + " and age: " + age);

        System.out.println("********************");
        //defining grade type and storing value of determinegrade into grade
        GradeType grade = null;
        try {
            grade = UtilityClass.determineGradeBasedOnAge(age);
        } catch (AgeNotCorrectException e) {
            System.out.println("Age has to be between 4 and 17");
        }

        System.out.println("********************");
        //defining school type and storing value of determineschool into schooltype
        SchoolType schoolType = null;
        try {
            schoolType = UtilityClass.determineSchoolBasedOnGrades(grade);
        } catch (GradeNotCorrectException e) {
            System.out.println("School not available");
        }

        System.out.println("********************");
        //defining student object of student and storing schooltype into school
        //calling chargefees function
        Student student = new Student(name, age, grade);
        School school = UtilityClass.retrieveSchoolObjectBasedOnSchoolType(schoolType);
        try {
            school.admitStudent(student);
            school.chargeFees(student);
        } catch (ClassFullException e) {
            System.out.println("Sorry class for the grade " + grade + " is full, try another student");
        }
        }while (!name.equals("X") || !name.equals("x"));
    }
}
