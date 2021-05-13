public class Rectangle {
    private double width,height;
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }

    public static void main(String[] args) {
        Rectangle rect1=new Rectangle(23,43);

        System.out.println(rect1.getArea());
    }
}
