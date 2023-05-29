package Bai1;

public class Teacher extends People{
    protected String level;
    protected String experience;
    protected String subject;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher() {
        super();
    }

    public Teacher(String name, int age, String sex, double height, double weight, String level, String experience, String subject) {
        super(name, age, sex, height, weight);
        this.level = level;
        this.experience = experience;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Information teacher: \n " + super.toString() + "\n level: " + level + "\n experience: " + experience + "\n subject: " + subject;
    }
}
