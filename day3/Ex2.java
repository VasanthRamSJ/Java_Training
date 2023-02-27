package day3;

public class Ex2 {
	 public static void main(String[] args) {
	        Circle circle = new Circle(55.0);
	        Square square = new Square(40.0); 
	        Triangle triangle = new Triangle(33.0, 43.0, 51.0);             
	        Sphere sphere = new Sphere(35.0);
	        Cuboid cuboid = new Cuboid(42.0);
	        
	        System.out.println("Circle perimeter: " + circle.perimeter());
	        System.out.println("Circle area: " + circle.area());	 	
	        System.out.println();
	        System.out.println("Square area: " + square.area());
	        System.out.println("Square perimeter: " + square.perimeter())    ;
	        System.out.println();

	        System.out.println("Triangle area: " + triangle.area());
	        System.out.println("Triangle perimeter: " + triangle.perimeter());
	        System.out.println();

	     
	        System.out.println("Sphere area: " + sphere.area());
	        System.out.println("Sphere perimeter: " + sphere.perimeter());
	        System.out.println("Sphere surface area: " + sphere.surfaceArea());
	        System.out.println("Sphere volume: " + sphere.volume());
	        System.out.println();

	  
	        System.out.println("Cuboid area: " +     cuboid.area());
	        System.out.println("Cuboid perimeter: " + cuboid.perimeter());
	        System.out.println("Cuboid surface area: " + cuboid.surfaceArea());
	        System.out.println("Cuboid volume: " + cuboid.volume());
	    }
}
interface CalculateArea {
    double area();
    double perimeter();
}

interface CalculateVolume {
    double surfaceArea();
    double volume();
   
}

class Circle implements CalculateArea {
     double radius;
    final double pi = 22/7;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    public double area() {
        return pi * radius * radius;
    }
    
    public double perimeter() {
        return 2 * pi * radius;
    }
}

class Square implements CalculateArea {
    double side;
    
    Square(double side) {
        this.side = side;
    }
    
    public double area() {
        return side * side;
    }
    
    public double perimeter() {
        return 4 * side;
    }
}

class Triangle implements CalculateArea {
     double a;
     double b;
     double c;
    
    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    
    public double perimeter() {
        return a + b + c;
    }
}

class Sphere implements CalculateArea, CalculateVolume {
    double radius;
    final double pi = 22/7;
    
    Sphere(double radius) {
        this.radius = radius;
    }
    
    public double area() {
        return 4 * pi * radius * radius;
    }
    
    public double perimeter() {
        return 2 * pi * radius;
    }
    
    public double surfaceArea() {
        return 4 * pi * radius * radius;
    }
    
    public double volume() {
        return (4/3) * pi * radius * radius * radius;
    }
}

class Cuboid implements CalculateArea, CalculateVolume {
    double side;
    
    Cuboid(double side) {
        this.side = side;
    }
    
    public double area() {
        return side * side;
    }
    
    public double perimeter() {
        return 4 * side;
    }
    
    public double surfaceArea() {
        return 6 * side * side;
    }
    
    public double volume() {
        return side * side * side;
    }
}
