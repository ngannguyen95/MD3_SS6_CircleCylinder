package rikkei.academy;

public class Cylinder extends Circle{
    private int height;
    public Cylinder(){
    }

    public Cylinder(int height) {
        this.height = height;
    }

    public Cylinder(int radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getAre(){
        return super.getAre()*2+super.getPerimeter()*height;
    }
    public double getVolume(){
        return super.getAre()*this.height;
    }

    @Override
    public String toString() {
        return "Hình trụ có bán kính : "
                + super.getRadius()
                +" và chiều cao :"
                +this.height
                +" là 1 lớp con của Circle có đặc điểm:\n "
                +super.toString();

    }
}
