package school;

public class MiddleSchool extends AbstractSchool{
    @Override
    public Double chargeFees(Student student) {
        double fees = 0;
        double fees6 = 100 * 1.75;
        double fees7 = fees6 + (fees6 * 0.35);
        double fees8 = fees7 + (fees7 * 0.35);

        if(student.getGrade() == GradeType.SIXTH_GRADE){
            fees =  fees6;
            fees =  Math.round(fees);
            System.out.println("Fees for Sixth Grade is " + fees);
        }
        else if(student.getGrade() == GradeType.SEVENTH_GRADE){
            fees = fees7;
            fees =  Math.round(fees);
            System.out.println("Fees for Seventh Grade is " + fees);
        }
        else if(student.getGrade() == GradeType.EIGHTTH_GRADE){
            fees = fees8;
            fees =  Math.round(fees);
            System.out.println("Fees for Eighth Grade is " + fees);
        }
        else {
            System.out.println("Fees not available for Middle school");
        }
        return fees;
    }
}
