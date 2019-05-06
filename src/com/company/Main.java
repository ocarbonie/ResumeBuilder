package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Resume> candidate = new ArrayList<>();
        ArrayList<String> jobDescription = new ArrayList<>();
        Resume person1 = new Resume();
        String oneMore = "Y";

        //Personal Information
        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Email: ");
        String email = input.nextLine();

        PersonalInfo person = new PersonalInfo(name, email);
        person1.addPersonal(person);

        //Education Information
        while (oneMore.equalsIgnoreCase("Y")) {
            System.out.println("\nEducation Information");
            System.out.print("School: ");
            String schoolName = input.nextLine();

            System.out.print("Degree earned at " + schoolName + ": ");
            String degreeEarned = input.nextLine();

            System.out.print("Major: ");
            String major = input.nextLine();

            System.out.print("Year graduated (i.e: xxxx): ");
            int year = input.nextInt();
            input.nextLine();

            person1.addEducation(new EducationalInfo(degreeEarned, major, schoolName, year));

            System.out.println("Would you like to enter another degree?(y/n) ");
            oneMore = input.nextLine();
        }

        //Experience Information
        oneMore = "Y";
        while (oneMore.equalsIgnoreCase("Y")) {
            System.out.println("\nExperience");
            System.out.print("Job Title: ");
            String jobTitle = input.nextLine();

            System.out.print("Company name: ");
            String companyName = input.nextLine();

            System.out.print("Date started(i.e: xx/xx/xxxx): ");
            String dateStart = input.nextLine();

            System.out.print("Date ended(i.e: xx/xx/xxxx): ");
            String dateEnd = input.nextLine();

            System.out.println("Job Description: ");
            String jobDesc = input.nextLine();
            jobDescription.add(jobDesc);

            System.out.println("Please enter another job description for this position or press q: ");
            String moreDesc = input.nextLine();


            while (!moreDesc.equalsIgnoreCase("q")) {
                jobDescription.add(moreDesc);
                System.out.println("Please enter another job description for this position or press q: ");

                if (!oneMore.equalsIgnoreCase("q")) {
                    moreDesc = input.nextLine();

                }

            }
            person1.addExpericence(new ExperienceInfo(companyName, jobTitle, dateStart, dateEnd, jobDescription));
            System.out.println("\nWould you like to enter another experience?(y/n) ");
            oneMore = input.nextLine();
            jobDescription = new ArrayList<>();
        }


                //Skills Information
        System.out.println("\n\nPlease enter 3 skills");
                oneMore = "Y";
                System.out.println("\nSkills");
                while (oneMore.equalsIgnoreCase("Y")) {
                    System.out.print("Skill name: ");
                    String skill = input.nextLine();

                    System.out.println("Choose proficiency rating for " + skill);
                    System.out.println("i.e: novice,fundamental, intermediate, advanced");
                    String rating = input.nextLine();

                    person1.addSkills(new SkillsInfo(skill, rating));

                    System.out.println("\nWould you like to enter another skill(y/n)? ");
                    oneMore = input.nextLine();
                }

                person1.printResume();
            }
        }


