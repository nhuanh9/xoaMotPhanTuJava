package bttonghop;

public class Teacher extends Person {
    private int level;
    private int salary;

    public Teacher() {
    }

    public Teacher(String name, int age, String address, int gender, int level, int salary) {
        super(name, age, address, gender);
        this.level = level;
        this.salary = salary;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "level=" + level +
                ", salary=" + salary +
                '}';
    }
}
