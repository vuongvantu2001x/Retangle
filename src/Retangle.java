import java.util.Scanner;

public class Retangle {
    double width, height;

    public Retangle() {
    }

    public Retangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return ( this.width + this.height) * 2;
    }

    public String display() {
        return "Retangle{" + "width " + width + "\t height " + height + "}";
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = sc.nextDouble();
        System.out.print("Enter the height:");
        double height = sc.nextDouble();
        Retangle retangle = new Retangle(width, height);
        System.out.println("Your Retanglt \n" + retangle.display());
        System.out.println("Perimeter of the Retangle " + retangle.getPerimeter());
        System.out.println("Area of the Retangle: " + retangle.getArea());
    }
}
