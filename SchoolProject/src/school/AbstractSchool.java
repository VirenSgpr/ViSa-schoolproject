package school;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractSchool implements School {
    @Override
    public Student admitStuednt(String name, int age, String grade) {
        return null;
    }

    Map<GradeType, List<Student>> gradeToStudentsMap = new HashMap<>();
}
