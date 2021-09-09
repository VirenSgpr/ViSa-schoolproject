package school;


public class UtilityClass {

    public static GradeType determineGradeBasedOnAge(int age) throws AgeNotCorrectException{
        System.out.println("Determining grade done");
        switch (age){
            case 4:
                System.out.println("GradeType is " + GradeType.JK_GRADE);
                return GradeType.JK_GRADE;
            case 5:
                System.out.println("GradeType is " + GradeType.SK_GRADE);
                return GradeType.SK_GRADE;
            case 6:
                System.out.println("GradeType is " + GradeType.GRADE_1);
                return GradeType.GRADE_1;
            case 7:
                System.out.println("GradeType is " + GradeType.SECOND_GRADE);
                return GradeType.SECOND_GRADE;
            case 8:
                System.out.println("GradeType is " + GradeType.THIRD_GRADE);
                return GradeType.THIRD_GRADE;
            case 9:
                System.out.println("GradeType is " + GradeType.FOURTH_GRADE);
                return GradeType.FOURTH_GRADE;
            case 10:
                System.out.println("GradeType is " + GradeType.FIFTH_GRADE);
                return GradeType.FIFTH_GRADE;
            case 11:
                System.out.println("GradeType is " + GradeType.SIXTH_GRADE);
                return GradeType.SIXTH_GRADE;
            case 12:
                System.out.println("GradeType is " + GradeType.SEVENTH_GRADE);
                return GradeType.SEVENTH_GRADE;
            case 13:
                System.out.println("GradeType is " + GradeType.EIGHTTH_GRADE);
                return GradeType.EIGHTTH_GRADE;
            case 14:
                System.out.println("GradeType is " + GradeType.NINTH_GRADE);
                return GradeType.NINTH_GRADE;
            case 15:
                System.out.println("GradeType is " + GradeType.TENTH_GRADE);
                return GradeType.TENTH_GRADE;
            case 16:
                System.out.println("GradeType is " + GradeType.ELEVENTH_GRADE);
                return GradeType.ELEVENTH_GRADE;
            case 17:
                System.out.println("GradeType is " + GradeType.TWELVETH_GRADE);
                return GradeType.TWELVETH_GRADE;
            default:
                throw new AgeNotCorrectException("Age has to be between 4 and 17");
        }
    }

    public static SchoolType determineSchoolBasedOnGrades(GradeType grade) throws GradeNotCorrectException{
        System.out.println("Determining school done");
        switch (grade){
            case JK_GRADE:
            case SK_GRADE:
                System.out.println("School is " + SchoolType.PRE_SCHOOL);
                return SchoolType.PRE_SCHOOL;
            case GRADE_1:
            case SECOND_GRADE:
            case THIRD_GRADE:
            case FOURTH_GRADE:
            case FIFTH_GRADE:
                System.out.println("School is " + SchoolType.ELEMENTARY_SCHOOL);
                return SchoolType.ELEMENTARY_SCHOOL;
            case SIXTH_GRADE:
            case SEVENTH_GRADE:
            case EIGHTTH_GRADE:
                System.out.println("School is " + SchoolType.MIDDLE_SCHOOL);
                return SchoolType.MIDDLE_SCHOOL;
            case NINTH_GRADE:
            case TENTH_GRADE:
            case ELEVENTH_GRADE:
            case TWELVETH_GRADE:
                System.out.println("School is " + SchoolType.HIGH_SCHOOL);
                return SchoolType.HIGH_SCHOOL;
            default:
                throw new GradeNotCorrectException("School is not available");
        }
    }
}
