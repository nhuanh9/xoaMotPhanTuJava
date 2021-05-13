package BaiMangVaPhuong;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void move() {
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x="+getX()+
                ", y="+getY()+
                ",xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public static void main(String[] args) {
        MovablePoint a = new MovablePoint(1, 1, 20, 10);
        a.move();
        a.move();
        a.move();
        a.move();
        a.move();
        System.out.println(a);
    }
}
