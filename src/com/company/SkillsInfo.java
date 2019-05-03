package com.company;

public class SkillsInfo {
    private String skillName;
    private String proficiencyRating;

    public SkillsInfo() {
    }

    public SkillsInfo(String skillName, String proficiencyRating) {
        this.skillName = skillName;
        this.proficiencyRating = proficiencyRating;
    }

    public String getSkillName() {
        return skillName;
    }

    public void addSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getProficiencyRating() {
        return proficiencyRating;
    }

    public void addProficiencyRating(String proficiencyRating) {
        this.proficiencyRating = proficiencyRating;
    }
    @Override
    public String toString(){
        return ("\n" + getSkillName()+", " + getProficiencyRating());
    }
}
