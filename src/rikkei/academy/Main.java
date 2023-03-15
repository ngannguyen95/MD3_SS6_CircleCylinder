package rikkei.academy;

public class Main {
    public static void main(String[] args) {
        System.out.println("------CIRCLE------");
        Circle circle=new Circle();
        System.out.println(circle);

        circle =new Circle(5,"red");
        System.out.println(circle);
//        System.out.println("Diện tích:  "+circle.getAre());
//        System.out.println("Chu vi:  "+circle.getPerimeter());

        System.out.println("------CYLINDER------");
        Cylinder cylinder=new Cylinder(5);
        System.out.println(cylinder);
        System.out.println("Diện tích hinh trụ : " + cylinder.getAre());
        System.out.println("Thể tích :  "+cylinder.getVolume());
    }
}
