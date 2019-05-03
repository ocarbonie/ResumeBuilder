package com.company;

import java.util.ArrayList;

public class ExperienceInfo {
    private String companyName;
    private String jobTitle;
    private String startDate;
    private String endDate;
//    private String jobDesc;
    private ArrayList<String> jobDesc1 = new ArrayList<>();

    public ExperienceInfo() {
    }

//    public ExperienceInfo(ArrayList<String> jobDesc1) {
//        this.jobDesc1 = new ArrayList<>();
//    }

        public ExperienceInfo(String companyName, String jobTitle,
                          String startDate, String endDate, ArrayList<String> jobDesc1) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.jobDesc1 = jobDesc1;

    }
//    public ExperienceInfo(String companyName, String jobTitle,
//                          String startDate, String endDate,
//                          String jobDesc) {
//        this.companyName = companyName;
//        this.jobTitle = jobTitle;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.jobDesc = jobDesc;
//    }

    public String getCompanyName() {
        return companyName;
    }

    public void addCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void addJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void addStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void addEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void addJobDesc(String jobDesc) {
        jobDesc1.add(jobDesc);
    }

    public String getJobDesc() {
//        String m ="";
//        for(int i = 0; i<jobDesc1.size(); i++){
//             m += jobDesc1.get(i) + "\n";
//            }
        StringBuilder out = new StringBuilder();
        for(String m: jobDesc1){
            out.append(m);
            out.append("\n");
        }
            return out.toString();
    }

//     public void addJobDesc(String jobDesc) {
//         String[] strArray = jobDesc.split(",");
//         for (int i = 0; i < strArray.length; i++) {
//             jobDesc1.add(strArray[1]);
//         }
//         for (String c : jobDesc1) {
//             System.out.println("-" + c);
//         }
//     }

//    }

    @Override
    public String toString() {
        return ("\n" + jobTitle + "\n" + getCompanyName() + ", " + getStartDate() +
                " - " + getEndDate() + "\n"  + getJobDesc());
    }
}
