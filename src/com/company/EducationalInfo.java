package com.company;

public class EducationalInfo {
    private String degreeType;
    private String major;
    private String universityName;
    private int gradYear;

    public EducationalInfo() {
    }

    public EducationalInfo(String degreeType,
                           String major, String universityName,
                           int gradYear) {
        this.degreeType = degreeType;
        this.major = major;
        this.universityName = universityName;
        this.gradYear = gradYear;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void addDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getMajor() {
        return major;
    }

    public void addMajor(String major) {
        this.major = major;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void addUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void addGradYear(int gradYear) {
        this.gradYear = gradYear;
    }
    @Override
    public String toString(){
        return ("\n" + getDegreeType()+" in "+ getMajor() + "," +"\n"+ getUniversityName()+", "+ + getGradYear());
    }
}
