package Ex5;

import java.util.Scanner;

class Circle {
    static int count;
    private final int radius;
    private int area;

    Circle() {
        count++;
        System.out.println("Enter the Radius : ");
        Scanner sc = new Scanner(System.in);
        this.radius = sc.nextInt();
        Carea();
    }

    Circle(int n) {
        count++;
        this.radius = n;
        Carea();
    }

    private void Carea() {
        this.area = (int) (Math.PI * radius * radius);
    }

    void display() {
        System.out.println("Count : " + count);
        System.out.println("Radius: " + radius);
        System.out.println("Area : " + area);
    }

    public static void main(String[] args) {
// only one circle object 
        Circle c = new Circle();
        c.display();
// array of circle objects 
        Circle[] cr = new Circle[5];
        cr[0] = new Circle(2);
        cr[1] = new Circle(3);
        cr[2] = new Circle(4);
        cr[3] = new Circle(5);
        cr[4] = new Circle(6);
        for (Circle crr : cr) {
            crr.display();
        }
    }
} 
