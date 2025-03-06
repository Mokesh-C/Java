package Ex6;

abstract class Shape {
    protected String color;
    private static int count;

    public Shape(String color) {
        this.color = color;
        count++;
    }

    abstract void dispArea();

    abstract void dispPerimeter();

    public void displayInfo() {
        System.out.println("Color : " + this.color);
        System.out.println("Total Shapes Created : " + count);
    }
}

abstract class TwoDShape extends Shape {
    public TwoDShape(String color) {
        super(color);
    }
}

abstract class ThreeDShape extends Shape {
    public ThreeDShape(String color) {
        super(color);
    }

    public abstract void getVolume();
}

class Circle extends TwoDShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public void dispArea() {
        System.out.println("Circle Area : " + getArea());
        displayInfo();
    }

    public void dispPerimeter() {
        System.out.println("Circle Perimeter : " + getPerimeter());
        displayInfo();
    }

}

class Cuboid extends ThreeDShape {
    private double length, width, height;

    public Cuboid(String color, double length, double width, double height) {
        super(color);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double volume() {
        return length * width * height;
    }

    public void getVolume() {
        System.out.println("Cuboid Volume : " + volume());
        displayInfo();
    }

    public double getArea() {
        return 2 * (length * width + width * height +  length * height);
    }

    public double getPerimeter(){
        return 4 * (length * width * height);
    }

    public void dispArea(){
        System.out.println("Cuboid Surface Area : " + getArea());
        displayInfo();
    }

    public void dispPerimeter(){
        System.out.println("Cuboid Perimeter : " + getPerimeter());
    }
}

public class TestShape {
    public static void main(String[] args) {

        //Task 1
        Circle cr = new Circle("Safran", 5);
        cr.dispArea();
        cr.dispPerimeter();

        Cuboid cu = new Cuboid("Green",3,4,5);
        cu.dispArea();
        cu.dispPerimeter();
        cu.getVolume();


        // Task 2
        Shape[] sh = new Shape[5];
        sh[0] = new Circle("Green",6);
        sh[1] = new Circle("Safran",7);
        sh[2] = new Circle("Blue",5);
        sh[3] = new Cuboid("Pink", 3,4,5);
        sh[4] = new Cuboid("Yellow", 6,7,8);

        for(Shape s : sh){
            s.dispArea();
            s.dispPerimeter();
            if(s instanceof ThreeDShape) ((ThreeDShape) s).getVolume();
        }
    }
}
