package oop1;

public class Student {

    private String name;
    private int age;
    private int score1;
    private int score2;
    private int totalScore;
    public static String school = "Codegym";


    public Student(String name, int age, int dth, int score2) {
        this.name = name;
        this.age = age;
        score1 = dth;
        this.score2 = score2;
        totalScore = this.score1 + this.score2;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public String toString() {
        return "Tên: "+this.name+", tổng điểm: " +this.totalScore;
    }



}


class A {
    public static void main(String[] args) {
        Student st1 = new Student("Hi", 19,2,20);
        st1.school = "CGM";
        System.out.println(st1.school);
        System.out.println(Student.school);
    }

}