package school;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractSchool implements School {
    Map<GradeType, List<Student>> gradeToStudentsMap = new HashMap<>();

    @Override
    public Student admitStudent(String name, int age, GradeType grade) throws ClassFullException {
        return null;
    }


}
