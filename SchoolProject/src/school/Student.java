package school;

public class Student {
//    private String studentID;
    private String name;
    private int age;
    private GradeType grade;

    private Student() {
    }

    public Student(String name, int age, GradeType grade) {
//        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

//    public String getStudentID() {
//        return studentID;
//    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public GradeType getGrade() {
        return grade;
    }

//    public void setStudentID(String studentID) {
//        this.studentID = studentID;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(GradeType grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" +
//                studentID +
                '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }
}


