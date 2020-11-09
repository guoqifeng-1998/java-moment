package main.java.com.soft2036.study.week3;

/**
 * @ClassName CircleApp
 * @Description TODO
 * @Author 郭崎锋
 * @Date 2020/10/19
 **/
public class CircleApp {
    public static void main(String[] args) {
        point point = new point(10,20);
        Circle circle = new Circle(10,20,5);
        Cylinder cylinder = new Cylinder(10,10,5,6);
        point.print();
        circle.print();
        cylinder.print();
        
    }
}
