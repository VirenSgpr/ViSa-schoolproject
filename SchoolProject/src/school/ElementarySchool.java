package school;

public class ElementarySchool extends AbstractSchool{
    @Override
    public Double chargeFees(Student student) {
        double fees = 0;
        double fees1 = 100 * 1.5;
        double fees2 = fees1 + (fees1 * 0.3);
        double fees3 = fees2 + (fees2 * 0.3);
        double fees4 = fees3 + (fees3 * 0.3);
        double fees5 = fees4 + (fees4 * 0.3);

        if(student.getGrade() == GradeType.GRADE_1){
            fees =  fees1;
            System.out.println("Fees for First Grade is " + fees);
        }
        else if(student.getGrade() == GradeType.SECOND_GRADE){
            fees = fees2;
            fees =  Math.round(fees);
            System.out.println("Fees for Second Grade is " + fees);
        }
        else if(student.getGrade() == GradeType.THIRD_GRADE){
            fees = fees3;
            fees =  Math.round(fees);
            System.out.println("Fees for Third Grade is " + fees);
        }
        else if(student.getGrade() == GradeType.FOURTH_GRADE){
            fees = fees4;
            fees =  Math.round(fees);
            System.out.println("Fees for Fourth Grade is " + fees);
        }
        else if(student.getGrade() == GradeType.FIFTH_GRADE){
            fees = fees5;
            fees =  Math.round(fees);
            System.out.println("Fees for Fifth Grade is " + fees);
        }
        else {
            System.out.println("Fees not available for Elementary school");
        }
        return fees;
    }
}
