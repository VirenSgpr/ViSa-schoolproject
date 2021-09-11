import org.junit.Assert;
import org.junit.Test;
import school.GradeType;
import school.Preschool;
import school.Student;

public class testSchoolFees {
    @Test
    public void testPreSchoolFees(){
        Preschool preschool = new Preschool();
        Student student = new Student("Viren",4, GradeType.JK_GRADE);
        double fees = preschool.chargeFees(student);
        Assert.assertTrue(fees == 110.00 );
    }
}
