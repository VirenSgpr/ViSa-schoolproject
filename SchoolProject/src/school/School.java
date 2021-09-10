package school;

public interface School {
    Student admitStudent(String name, int age, GradeType grade) throws ClassFullException;
    Double chargeFees(Student student);

}
