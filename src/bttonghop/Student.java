package bttonghop;

public class Student extends Person  {
    private String School;

    public Student() {
    }

    public Student(String name, int age, String address, int gender, String school) {
        super(name, age, address, gender);
        School = school;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    @Override
    public String toString() {
        return super.toString()+ " School = " + getSchool();

    }
}
