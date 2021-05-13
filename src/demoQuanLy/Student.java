package demoQuanLy;

public class Student extends Person implements Comparable<String> {

    private int score;

    public Student(int score, String name, int age) {
        this.score = score;
        setAge(age);
        setName(name);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void chaoHoi() {
        System.out.println("Cô chú rất chào con!");
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
}
