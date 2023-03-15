package rikkei.academy;

public class Circle {
    private int radius = 2;
    private String color = "green";

    public Circle() {
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAre() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Hình tròn có bán kính: "
                + getRadius()
                + " và màu "
                + getColor()
                +" có diện tích là :"
                +getAre()
                +" và chu vi : "
                +getPerimeter();
    }
}
