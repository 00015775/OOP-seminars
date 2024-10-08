public class Circle extends Shape{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    void calculateArea(){
        double area = Math.PI * radius;
        System.out.println("The area of the circle: " + area);
    }

}
