import org.junit.Assert;
import org.junit.Test;
import school.*;

public class testSchoolFees {
    @Test
    public void testPreSchoolFees() {
        Preschool preschool = new Preschool();
        Student student = new Student("Viren", 4, GradeType.JK_GRADE);
        double fees = preschool.chargeFees(student);
        Assert.assertTrue(fees == 110.00);
    }

    @Test
    public void testElementarySchoolFees() {
        Student student = new Student("Viren", 8, GradeType.THIRD_GRADE);

        ElementarySchool elementarySchool = new ElementarySchool();
        double fees = elementarySchool.chargeFees(student);
        Assert.assertTrue(fees == 254.0);

    }

    @Test
    public void testMiddleSchoolFees() {
        Student student = new Student("Vishal", 13, GradeType.SIXTH_GRADE);

        MiddleSchool middleSchool = new MiddleSchool();
        double fees = middleSchool.chargeFees(student);
        Assert.assertTrue(fees == 175.00);
    }

    @Test
    public void testHighSchoolFees() {
        Student student = new Student("Abhi", 17, GradeType.NINTH_GRADE);

        HighSchool highSchool = new HighSchool();
        double fees = highSchool.chargeFees(student);
        Assert.assertTrue(fees == 200.00);
    }
}
