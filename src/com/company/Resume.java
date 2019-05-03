package com.company;

import com.sun.java.swing.plaf.windows.WindowsTreeUI;

import java.util.ArrayList;

public class Resume {
    ArrayList<PersonalInfo> personal = new ArrayList<>();
    ArrayList<EducationalInfo> education = new ArrayList<>();
    ArrayList<ExperienceInfo> experience = new ArrayList<>();
    ArrayList<SkillsInfo> skills = new ArrayList<>();

    public Resume() {
    }

    //This will get the info from the personalInfo arrayList
    public ArrayList<PersonalInfo> getPersonal() {
        return personal;
    }

    //This will add the object to the personalInfo arrayList
    public void addPersonal(PersonalInfo person) {
        personal.add(person);
    }

    //This will get the info from the educationalInfo arrayList
    public ArrayList<EducationalInfo> getEducation() {
        return education;
    }

    //This will add the object in the educationalInfo arrayList
    public void addEducation(EducationalInfo edu) {
        education.add(edu);
    }

    //This will get the info from the ExperienceInfo arrayList
    public ArrayList<ExperienceInfo> getExpericence() {
        return experience;
    }

    //This will add the object in the ExperienceInfo arrayList
    public void addExpericence(ExperienceInfo expe) {
        experience.add(expe);
    }

    //This will get the info for skills
    public ArrayList<SkillsInfo> getSkills() {
        return skills;
    }

    //This will add the skills to the ArrayList SkillsInfo
    public void addSkills(SkillsInfo skill) {
        skills.add(skill);
    }


    public void printResume(){
        System.out.println("---------------------------------");
        for (PersonalInfo person : personal) {
            System.out.println(person);
        }

        System.out.print("\nEDUCATION");
        for (EducationalInfo educate : education) {
            System.out.println(educate);
        }

        System.out.print("\nEXPERIENCE");
        for (ExperienceInfo exper : experience) {
            System.out.println(exper);
        }

        System.out.print("\nSKILLS");
        for (SkillsInfo skill : skills) {
            System.out.print(skill);
        }
    }
}














