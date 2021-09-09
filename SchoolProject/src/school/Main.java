package school;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        //Initial Details of Project
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************************************");
        System.out.println("Welcome to the School Admissions App !!!   Press X for exit");
        System.out.println("**************************************");

        String name;
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

        int age;
        do {
            System.out.println("Enter the age of the student: ");
            age = scanner.nextInt();
            if(age < 4 || age > 17){
                System.out.println("No schools available, Please enter valid age for school");
            }
        } while(age < 4 || age > 17);

        System.out.println("Student Name: " + name + " and age: " + age);



    }
}
