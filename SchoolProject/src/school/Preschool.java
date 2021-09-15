package school;

public class Preschool extends AbstractSchool{
    @Override
    public Double chargeFees(Student student) {
        double fees = 100 * 1.1;
        if(student.getGrade() == GradeType.JK_GRADE){
            fees =  Math.round(fees);
            System.out.println("Fees for JK is " + fees);
        }
        else if(student.getGrade() == GradeType.SK_GRADE){
            fees = fees + (fees * 0.25);
            fees =  Math.round(fees);
            System.out.println("Fees for SK is " + fees);
        }
        else {
            System.out.println("Fees not available for Preschool");
        }
        return fees;
    }
}
