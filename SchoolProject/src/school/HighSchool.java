package school;

public class HighSchool extends AbstractSchool{
    @Override
    public Double chargeFees(Student student) {
        double fees = 0;
        double fees9 = 100 * 2.0;
        double fees10 = fees9 + (fees9 * 0.45);
        double fees11 = fees10 + (fees10 * 0.45);
        double fees12 = fees11 + (fees11 * 0.45);

        if(student.getGrade() == GradeType.NINTH_GRADE){
            fees =  fees9;
            System.out.println("Fees for Ninth Grade is " + fees);
        }
        else if(student.getGrade() == GradeType.TENTH_GRADE){
            fees = fees10;
            System.out.println("Fees for Tenth Grade is " + fees);
        }
        else if(student.getGrade() == GradeType.ELEVENTH_GRADE){
            fees = fees11;
            System.out.println("Fees for Eleventh Grade is " + fees);
        }
        else if(student.getGrade() == GradeType.TWELVETH_GRADE){
            fees = fees12;
            System.out.println("Fees for Twelfth Grade is " + fees);
        }
        else {
            System.out.println("Fees not available for High school");
        }
        return fees;
    }
}
