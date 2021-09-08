package school;

public interface School {
    Student admitStuednt(String name, int age, String grade);
    Double chargeFees(Student student);
}
