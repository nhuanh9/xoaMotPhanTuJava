package demoQuanLy;

public class Teacher extends Person{
    private int salary;

    public Teacher(int salary, String name, int age) {
        this.salary = salary;
        setAge(age);
        setName(name);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void chaoHoi() {
        System.out.println("Chào cô chú!");
    }
}
