package school;

public enum SchoolType {
    PRE_SCHOOL("PreSchool"),
    ELEMENTARY_SCHOOL("ElemantarySchool"),
    MIDDLE_SCHOOL("MiddleSchool"),
    HIGH_SCHOOL("HighSchool");

    private String schoolName;
    SchoolType(String schoolName){
        this.schoolName = schoolName;
    }
}
